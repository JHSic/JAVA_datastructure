import java.util.Scanner;

public class BSTApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			BST bst = new BST();
			
			System.out.print("���ڿ����� �Է��ϼ��� (�������� quit) : ");
			
			String insert = s.nextLine();
			
			if(insert.equals("quit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			String[] names = insert.split(" ");
			for(int i = 0; i < names.length; i++) {
				bst.put(names[i]);
			}
			bst.display(bst.getRoot());
		}
	}
}