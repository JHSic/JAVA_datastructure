import java.util.Scanner;

public class TreeApp {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("노드 개수를 입력하세요 : ");
		int nodeNum = s.nextInt();
		
		if(nodeNum == 0) {
			System.out.println("노드가 존재하지 않습니다.");
		}
		else {
			Tree tree = new Tree(nodeNum + 1);
			
			tree.print();
		}
	}
}