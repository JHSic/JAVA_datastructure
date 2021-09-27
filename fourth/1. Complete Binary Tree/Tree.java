public class Tree {
	private int size;
	private int [] nodes;
	
	public Tree(int arrSize) {
		this.size = arrSize;
		nodes = new int[size];
		
		for(int i = 1; i < size; i++) {
			nodes[i] = i;
		}
	}
	
	public int getLeft(int nodeNum) {
		if(size > nodeNum * 2) {
			return nodes[2 * nodeNum];
		}
		return 0;
	}
	public int getRight(int nodeNum) {
		if(size > nodeNum * 2 + 1) {
			return nodes[2 * nodeNum + 1];
		}
		return 0;
	}
	
	public void print() {
		int root = 1;
		
		displayTree(root);
		System.out.print("preorder : ");
		preorder(root);
		System.out.print("\ninorder : ");
		inorder(root);
		System.out.print("\npostorder : ");
		postorder(root);
		System.out.print("\nlevel order : ");
		levelorder(root);
	}
	
	public void preorder(int nodeNum) {
		if(nodeNum != 0) {
			System.out.print(nodes[nodeNum] + " ");
			preorder(getLeft(nodeNum));
			preorder(getRight(nodeNum));
		}
	}
	
	public void inorder(int nodeNum) {
		if(nodeNum != 0) {
			inorder(getLeft(nodeNum));
			System.out.print(nodes[nodeNum] + " ");
			inorder(getRight(nodeNum));
		}
	}
	
	public void postorder(int nodeNum) {
		if(nodeNum != 0) {
			postorder(getLeft(nodeNum));
			postorder(getRight(nodeNum));
			System.out.print(nodes[nodeNum] + " ");
		}
	}
	
	public void levelorder(int root) {
		ArrayQueue<Integer> q = new ArrayQueue<>();
		int t;
		q.add(root);
		while(!q.isEmpty()) {
			t = q.remove();
			if(t != 0) {
				System.out.print(nodes[t] + " ");
				q.add(getLeft(t));
				q.add(getRight(t));
			}
		}
	}
	
	//도서관에 구비되어있는 "Data Structure with JAVA Language(자바 자료구조론) - 송주석 / 서상훈" 에 나와있는 코드를 Stack과 수정을 더하여 구현했습니다.
	public void displayTree(int root) {
		ArrayStack<Integer> stack = new ArrayStack<>();
		stack.push(root);
		int blank = 32;
		boolean isRowEmpty = false;
		
		while(isRowEmpty == false) {
			ArrayStack<Integer> tempStack = new ArrayStack<Integer>();
			isRowEmpty = true;
			
			for(int i = 0 ; i < blank; i++) {
				System.out.print(" ");
			}
			
			while(stack.isEmpty() == false) {
				Integer temp = stack.pop();
				
				if(temp != 0) {
					System.out.print(nodes[temp]);
					tempStack.push(getLeft(temp));
					tempStack.push(getRight(temp));
					
					if(getLeft(temp) != 0 || getRight(temp) != 0) {
						isRowEmpty = false;
					}
				}
				else {
					System.out.print("X");
					tempStack.push(0);
					tempStack.push(0);
				}
				for(int i = 0; i < blank * 2 - 1; i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
			blank = blank / 2;
			
			while(tempStack.isEmpty() == false) {
				stack.push(tempStack.pop());
			}
		}
	}
}