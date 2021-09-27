import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
	
		ListQueue<Token> queue = new ListQueue<Token>();
		
		boolean flag = true;
		while(flag) {
			System.out.print("식을 입력하세요 (종료는 quit) : ");
			
			String expression = s.nextLine();
			
			if(expression.equals("quit")) {
				System.out.println("**** 종료합니다 ****");
				flag = false;
				break;
			}
			String[] arr = expression.split(" ");
			
			for(int i = 0 ; i < arr.length; i++) {
				queue.enqueue(new Token(arr[i]));
			}
			Calculator c = new Calculator(expression);
			
			c.exprToInfix();
			c.infixToPostfix();
			c.calculate();
		}
	}
}