import java.util.Scanner;

public class TreeApp {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("��� ������ �Է��ϼ��� : ");
		int nodeNum = s.nextInt();
		
		if(nodeNum == 0) {
			System.out.println("��尡 �������� �ʽ��ϴ�.");
		}
		else {
			Tree tree = new Tree(nodeNum + 1);
			
			tree.print();
		}
	}
}