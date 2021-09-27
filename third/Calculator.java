package test;

public class Calculator {

    public static final int ILLEGAL_PARENTHESES = 0;
    public static final int UNDEFINED_OPER = 1;
    public static final int ILLEGAL_FORMAT = 2;
    public static final int ILLEGAL_PARENTHESES_CONTENT = 3;
    public static final int DIV_BY_ZERO = 5;
    public static final int NO_ERROR = -1;

    public String removeSpace(String original) {
        String res = "";

        for (int i = 0; i < original.length(); i++)
            if (original.charAt(i) != ' ')
                res += original.charAt(i);

        return res;
        // return original.replaceAll(" ", "");
    }

    public int hasError(String infix) {
        int errorCode = NO_ERROR;

        if (checkParentheses(infix))
            errorCode = ILLEGAL_PARENTHESES;
        else
        {
            String notation = infix + '@';

            for (int i = 0; i < notation.length() - 1; i++) {
                char curr = notation.charAt(i);
                char next = notation.charAt(i + 1);

                if (!isNumber(curr)) {
                    if (!(curr == '-' || curr == '+' || curr == '*' || curr == '/' || curr == '%' || curr == '(' || curr == ')' || curr == '^')) {
                        errorCode = UNDEFINED_OPER;
                        break;
                    }

                    if (i == 0 && (curr != '-' && curr != '(')) {
                        errorCode = ILLEGAL_FORMAT;
                        break;
                    }

                    if (curr == '(' && next == ')')
                        return ILLEGAL_PARENTHESES_CONTENT;
                    if (curr != ')' && (next != '-' && next != '(') && !isNumber(next))
                        return ILLEGAL_FORMAT;

                    if (curr == ')' && isNumber(next))
                        return ILLEGAL_FORMAT; // Syntax Error
                } else if (next == '(')
                    return ILLEGAL_FORMAT; // Syntax Error
            }
        }

        return errorCode;
    }

    public String changeSingleMinus(String infix) {
        String result = "";
        int checkPos = 0;

        for (;checkPos < infix.length() && infix.charAt(checkPos) == '-'; checkPos++)
            result += '~';

        for (; checkPos < infix.length(); checkPos++) {
            char cur = infix.charAt(checkPos);

            if (cur == '-') {
                char before = infix.charAt(checkPos - 1);
                if (before != ')' && !isNumber(before))
                    result += '~';
                else
                    result += cur;
            } else
                result += cur;
        }

        return result;
    }

    public TokenList changePostfix(String infix) {
        TokenList postFix = new TokenList();
        MyStack<Character> operStack = new MyStack<>();
        int cursor = 0;

        while (cursor < infix.length()){
            char curChar = infix.charAt(cursor);

            if (isNumber(curChar)){
                String opnd = "" + curChar;
                int counter = 1;
                for (; cursor + counter < infix.length() && isNumber(infix.charAt(cursor + counter)); counter++)
                    opnd += infix.charAt(cursor + counter);

                postFix.add(new Token(opnd, Token.OPND));
                cursor += counter;
            }
            else{
                if (operStack.isEmpty())
                    operStack.push(curChar);
                else {
                    char lastOper = operStack.pop();

                    if ((getICP(curChar) < getISP(lastOper) || curChar == '~') && curChar != ')') {
                        operStack.push(lastOper);
                        operStack.push(curChar);
                    } else {
                        if (curChar == ')')
                            for (; lastOper != '('; lastOper = operStack.pop())
                                postFix.add(new Token("" + lastOper, Token.OPER));
                        else {
                            while (true) {
                                if (getICP(curChar) >= getISP(lastOper)) {
                                    postFix.add(new Token("" + lastOper, Token.OPER));
                                    if (operStack.isEmpty()) {
                                        operStack.push(curChar);
                                        break;
                                    }
                                    lastOper = operStack.pop();
                                } else {
                                    operStack.push(lastOper);
                                    operStack.push(curChar);
                                    break;
                                }
                            }
                        }
                    }
                }
                cursor ++;
            }
        }

        // Flushing Stack
        while (!operStack.isEmpty())
        {
            char oper = operStack.pop();
            if (oper == ')')
                for (oper = operStack.pop(); oper != '('; oper = operStack.pop())
                    postFix.add(new Token("" + oper, Token.OPER));
            else
                postFix.add(new Token("" + oper, Token.OPER));
        }


        return postFix;
    }

    public int calPostFix(TokenList postFix) {
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < postFix.getCount(); i++) {
            Token token = postFix.At(i);

            // Operand
            if (token.getType() == Token.OPND)
                stack.push(Integer.parseInt(token.getData()));
                // Operator
            else {
                char oper = token.getData().charAt(0);

                if (oper == '~') {
                    stack.push(-stack.pop());
                } else {
                    int opnd2 = stack.pop();
                    int opnd1 = stack.pop();

                    switch (oper) {
                        case '+':
                            stack.push(opnd1 + opnd2);
                            break;
                        case '-':
                            stack.push(opnd1 - opnd2);
                            break;
                        case '*':
                            stack.push(opnd1 * opnd2);
                            break;
                        case '/':
                            if (opnd2 == 0)
                                throw new ArithmeticException();
                            stack.push(opnd1 / opnd2);
                            break;
                        case '%':
                            stack.push(opnd1 % opnd2);
                            break;
                        case '^':
                            stack.push((int) Math.pow(opnd1, opnd2));
                            break;
                    }
                }
            }
        }

        return stack.pop();
    }

    public void printErrorMessage(int errorCode) {

        switch (errorCode) {
            case ILLEGAL_PARENTHESES:
                System.out.println("[Error] : 괄호의 쌍이 맞지 않습니다.");
                break;
            case UNDEFINED_OPER:
                System.out.println("[Error] : 정의되지 않은 연산자가 있습니다.");
                break;
            case ILLEGAL_FORMAT :
                System.out.println("[Error] : 올바르지 않은 형식 입니다.");
                break;
            case ILLEGAL_PARENTHESES_CONTENT:
                System.out.println("[Error] : 괄호 안의 내용이 올바르지 않습니다.");
                break;
            case DIV_BY_ZERO:
                System.out.println("[Error] : 분모가 0 인 경우가 존재합니다.");
                break;
        }
    }

    private boolean isNumber(char chr) {
        return '0' <= chr && chr <= '9';
    }

    private int getISP(char c) {
        switch (c) {
            case '~':
                return 1;
            case '^':
                return 2;
            case '*':
            case '/':
            case '%':
                return 3;
            case '+':
            case '-':
                return 4;
            case '(':
            case ')':
                return 5;
        }
        return -1;
    }

    private int getICP(char c) {
        switch (c) {
            case '(':
            case ')':
                return 0;
            case '~':
                return 1;
            case '^':
                return 2;
            case '*':
            case '/':
            case '%':
                return 3;
            case '+':
            case '-':
                return 4;
        }
        return -1;
    }

    private boolean checkParentheses(String infix) {
        String checkString = "";

        for (int i = 0; i < infix.length(); i++)
            if (infix.charAt(i) == '(' || infix.charAt(i) == ')')
                checkString += infix.charAt(i);

        while (checkString.contains("()"))
            checkString = checkString.replace("()", "");

        return !checkString.isEmpty();
    }

}
