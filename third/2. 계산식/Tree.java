public class Tree {
	private TreeNode root;
	
	public Tree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void preorder(TreeNode root) throws Exception {
		if(root != null) {
			System.out.print(root.getTreeToken().getToken() + " ");
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	}
	
	//"Data Structure with JAVA Language(자바 자료구조론) - 송주석 / 서상훈" 에 나와있는 코드를 Stack과 수정을 더하여 구현했습니다.
	public void display(TreeNode root) throws Exception {
		Stack<TreeNode> node = new Stack<TreeNode>();
		node.push(root);
		int blank = 32;
		boolean isRowEmpty = false;
		
		while(isRowEmpty == false) {
			Stack<TreeNode> tmpStack = new Stack<TreeNode>();
			isRowEmpty = true;
			
			for(int i = 0 ; i < blank; i++) {
				System.out.print(" ");
			}
			
			while(!node.isEmpty()) {
				TreeNode temp = node.pop();
				
				if(temp != null) {
					if(!temp.getTreeToken().isOperator()) {
						System.out.print(temp.getValue());
						tmpStack.push(temp.getLeft());
						tmpStack.push(temp.getRight());
					}
					else {
						System.out.print("[" + temp.getValue() + "] " + temp.getTreeToken().getToken());
						tmpStack.push(temp.getLeft());
						tmpStack.push(temp.getRight());
					}
					if(temp.getLeft() != null || temp.getRight() != null) {
						isRowEmpty = false;
					}
				}
				else {
					System.out.print("x");
					tmpStack.push(null);
					tmpStack.push(null);
				}
				for(int i = 0; i < blank * 2 - 1; i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
			blank = blank / 2;
			
			while(tmpStack.isEmpty() == false) {
				node.push(tmpStack.pop());
			}
		}
		System.out.println();
	}
}