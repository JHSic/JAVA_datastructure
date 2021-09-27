import java.util.Scanner;

public class RepetitionFibonacci {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇번째 피보나치수를 구하고 싶으신가요? : ");
		
		int n = s.nextInt();
		
		System.out.println("반복을 이용한 " + n + "번째 피보나치수: " + fibonacci(n));
	}
	
	public static int fibonacci(int num) {
		int prev = 0;
		int prevPrev = 1;
		int cur = 1;
		
		if(num <= 1) {
			return num;
		}
		else {
			for(int i = 1; i <= num; i++) {
				cur = prevPrev + prev;
				prevPrev = prev;
				prev = cur;
			}
		}
		return cur;
	}
}