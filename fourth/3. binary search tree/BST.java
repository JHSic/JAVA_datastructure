public class BST <Key extends Comparable<Key>> {
	private Node root;
	
	public Node getRoot() {
		return root;
	}
	
	public BST() {
		this.root = null;
	}
	
	public void put(Key k) {
		root = put(root, k);
	}
	public Node put(Node n, Key k) {
		if(n == null) {
			return new Node(k);
		}
		int t = n.getKey().compareTo(k);
		if(t > 0) {
			n.setLeft(put(n.getLeft(), k));
		}
		else if(t < 0) {
			n.setRight(put(n.getRight(), k));
		}
		else {
			n.setKey(k);
		}
		return n;
	}
	
	public void print(Node root) {
		if(root != null) {
			print(root.getLeft());
			System.out.print(" " + root.getKey());
			print(root.getRight());
		}
	}
	
	///"Data Structure with JAVA Language(자바 자료구조론) - 송주석 / 서상훈" 에 나와있는 코드를 Stack과 수정을 더하여 구현했습니다.
	public void display(Node root) {
		ArrayStack<Node> nodeStack = new ArrayStack<>();
		nodeStack.push(root);
		int blank = 32;
		boolean isRowEmpty = false;
		
		while(isRowEmpty == false) {
			ArrayStack<Node> tmpStack = new ArrayStack<>();
			isRowEmpty = true;
			
			for(int i = 0 ; i < blank; i++) {
				System.out.print(" ");
			}
			
			while(nodeStack.isEmpty() == false) {
				Node temp = nodeStack.pop();
				
				if(temp != null) {
					System.out.print(temp.getKey());
					tmpStack.push(temp.getLeft());
					tmpStack.push(temp.getRight());
					
					if(temp.getLeft() != null || temp.getRight() != null) {
						isRowEmpty = false;
					}
				}
				else {
					System.out.print("X");
					tmpStack.push(null);
					tmpStack.push(null);
				}
				for(int i = 0; i < blank * 2 - 2; i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
			blank = blank / 2;
			
			while(tmpStack.isEmpty() == false) {
				nodeStack.push(tmpStack.pop());
			}
		}
		System.out.println();
	}
}