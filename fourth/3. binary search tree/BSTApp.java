import java.util.Scanner;

public class BSTApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			BST bst = new BST();
			
			System.out.print("문자열들을 입력하세요 (마지막은 quit) : ");
			
			String insert = s.nextLine();
			
			if(insert.equals("quit")) {
				System.out.println("종료합니다.");
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