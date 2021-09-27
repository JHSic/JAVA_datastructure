import java.util.Scanner;

public class HanoiTower {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("원반의 개수를 입력하시오. : ");
		
		int n = s.nextInt(); 
		moveHanoi(1, 2, 3, n);
		
		System.out.println("하노이탑 종료.");
	}

	public static void moveHanoi(int start, int move, int end, int num) {
		if(num == 0) {
			return;
		}
		moveHanoi(start, end, move, num-1);
		System.out.println("원판 " + num + "이 " + start + "에서 " + end + "으로 이동.");
		moveHanoi(move, start, end, num-1);
	}
}