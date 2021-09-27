public class Calculator {
	ListQueue<Token> postfix = new ListQueue<Token>();
	ListQueue<Token> infix = new ListQueue<Token>();
	Stack<Token> operStack = new Stack<>();
	Stack<Token> valueStack = new Stack<>();
	Stack<TreeNode> treeStack = new Stack<>();
	Token newToken = new Token();
	
	private String expression;
	private String postExpr = "";
	
	public Calculator(String newInfix) throws Exception {
		this.expression = newInfix;
	}
	
	public void exprToInfix() throws Exception {
		String[] arr = expression.split(" ");
		
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i].equals("-")) {
				if(i == 0) {
					infix.enqueue(new Token("m"));
				}
				else {
					if(newToken.isOperator(arr[i - 1])) {
						infix.enqueue(new Token("m"));
					}
					else {
						infix.enqueue(new Token(arr[i]));
					}
				}
			}
			else {
				infix.enqueue(new Token(arr[i]));
			}
		}
	}	
	
	public ListQueue<Token> infixToPostfix() throws Exception {
		
		operStack.push(new Token("#"));
		
		int count = infix.size();
		
		for(int i = 0 ; i < count; i++) {
			Token t = infix.dequeue();
			if(!newToken.isOperator(t.getToken())) {
				postfix.enqueue(t);
			}
			else if(t.getToken().equals(")")) {
				for(; !operStack.top().getToken().equals("(") ; operStack.pop()) { 
					postfix.enqueue(operStack.top());
				}
				operStack.pop();
			}
			else {
				if(operStack.top().getIsp() == 1) {
					for(; newToken.isp(operStack.top().getToken()) < newToken.icp(t.getToken()); operStack.pop()) {
						postfix.enqueue(operStack.top());
					}
				}
				else {
					for(; newToken.isp(operStack.top().getToken()) <= newToken.icp(t.getToken()); operStack.pop()) {
						postfix.enqueue(operStack.top());
					}
				}
				operStack.push(t);
			}
		}
		
		for(; !operStack.isEmpty(); postfix.enqueue(operStack.pop()));
		return postfix;
	}
	
	public void calculate() throws Exception {
		
		int count = postfix.size();
		try {
			for(int i = 0; i < count - 1; i++) {
				Token t = postfix.dequeue();
				postExpr += t.getToken() + " ";
				
				if(!t.isOperator()) {
					valueStack.push(t);
				}
				else {
					if(t.getToken().equals("~") || t.getToken().equals("m")) {
						int num1 = Integer.parseInt(valueStack.pop().getToken());
						valueStack.push(new Token(calculate(num1, t.getToken())));
					}
					else {
						int num1 = Integer.parseInt(valueStack.pop().getToken());
						int num2 = Integer.parseInt(valueStack.pop().getToken());
						valueStack.push(new Token(calculate(num1, num2, t.getToken())));
					}
				}
			}
			
		}
		catch(Exception e) {
			System.out.println("--- 후위 계산식은 : " + postExpr);
			System.out.println("[오류] 이해할 수 없는 수식");
			return;
		}
		System.out.println("--- 후위 계산식은 : " + postExpr);
		makeTree(postExpr);
		System.out.println("---- 결과는 " + Integer.parseInt(valueStack.top().getToken()));
	}
	
	public int calculate(int num1, int num2, String oper) throws Exception {
		switch(oper) {
		case "*":
			return (num2 * num1);
		case "/":
			return (num2 / num1);
		case "%":
			return (num2 % num1);
		case "+":
			return (num2 + num1);
		case "-":
			return (num2 - num1);
		case "<<":
			return (num2 << num1);
		case ">>":
			return (num2 >> num1);
		case "&":
			return (num2 & num1);
		case "^":
			return (num2 ^ num1);
		case "|":
			return (num2 | num1);
		}
		return -1;
	}
	
	public int calculate(int num1, String oper) {
		switch(oper) {
		case "m":
			return -num1;
		case "~":
			return ~num1;
		}
		return -1;
	}
	
	public void makeTree(String postExpr) throws Exception {
		String[] arr = postExpr.split(" ");
		
		for(int i = 0 ; i < arr.length; i++) {
			if(!new Token(arr[i]).isOperator()) {
				TreeNode tNode = new TreeNode(new Token(arr[i]), null, null);
				tNode.setValue(Integer.parseInt(arr[i]));
				treeStack.push(tNode);
			}
			else {
				if(new Token(arr[i]).getToken().equals("~") || new Token(arr[i]).getToken().equals("m")) {
					TreeNode lt = treeStack.pop();
					int num1 = lt.getValue();
					TreeNode n1 = new TreeNode(new Token(arr[i]), lt, null);
					treeStack.push(n1);
					n1.setValue(calculate(num1, arr[i]));
				}
				else {
					TreeNode firstPop = treeStack.pop();
					TreeNode secondPop = treeStack.pop();
					int num1 = firstPop.getValue();
					int num2 = secondPop.getValue();
					TreeNode n2 = new TreeNode(new Token(arr[i]), secondPop, firstPop);
					treeStack.push(n2);
					n2.setValue(calculate(num1, num2, arr[i]));
				}
			}
		}
		Tree tree = new Tree();
		System.out.print("--- 전위 계산식은 : ");
		tree.preorder(treeStack.top());
		System.out.println();
		tree.display(treeStack.top());
	}
}