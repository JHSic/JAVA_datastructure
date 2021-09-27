package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("������ �Է��ϼ��� (����� quit) : ");
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
                System.out.println("-- ���� ������� : " + postFix.toString());

                // TODO : Calculate Postfix
                try {
                    int calRes = calculator.calPostFix(postFix);
                    System.out.println("-- ������� : " + calRes);
                } catch (ArithmeticException e){
                    calculator.printErrorMessage(Calculator.DIV_BY_ZERO);
                }
            }
            // Has Error
            else {
                calculator.printErrorMessage(errorCode);
            }

            System.out.print("������ �Է��ϼ��� (����� quit) : ");
        }
        System.out.println("Turn off System");
    }
}
