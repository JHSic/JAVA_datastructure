package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("계산식을 입력하세요 (종료는 quit) : ");
        for (String input = scan.nextLine(); !input.equals("quit"); input = scan.nextLine()) {
            // TODO : Remove Input All Space
            input = calculator.removeSpace(input);

            // TODO : Check Input has error
            int errorCode = calculator.hasError(input);

            // No Error
            if (errorCode == -1) {
                // TODO : Convert Single Oper to ~-
                input = calculator.changeSingleMinus(input);

                // TODO : Change Postfix
                TokenList postFix = calculator.changePostfix(input);
                System.out.println("-- 후위 연산식은 : " + postFix.toString());

                // TODO : Calculate Postfix
                try {
                    int calRes = calculator.calPostFix(postFix);
                    System.out.println("-- 계산결과는 : " + calRes);
                } catch (ArithmeticException e){
                    calculator.printErrorMessage(Calculator.DIV_BY_ZERO);
                }
            }
            // Has Error
            else {
                calculator.printErrorMessage(errorCode);
            }

            System.out.print("계산식을 입력하세요 (종료는 quit) : ");
        }
        System.out.println("Turn off System");
    }
}
