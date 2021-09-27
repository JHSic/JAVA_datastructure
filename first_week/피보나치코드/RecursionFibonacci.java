import java.util.Scanner;

public class RecursionFibonacci {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇번째 피보나치수를 구하고 싶으신가요? : ");
		
		int n = s.nextInt();
		
		System.out.println("재귀를 이용한 " + n + "번째 피보나치수: " + fibonacci(n));
	}
	
	public static int fibonacci(int num) {
		if(num <= 1) {
			return num;
		}
		else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}
}