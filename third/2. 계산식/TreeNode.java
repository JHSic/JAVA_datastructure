public class TreeNode {
	private Token item;
	private int value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Token t, TreeNode lt, TreeNode rt) {
		item = t;
		left = lt;
		right = rt;
	}
	
	public Token getTreeToken() {
		return item;
	}
	public int getValue() {
		return value;
	}
	public TreeNode getLeft(){
		return left;
	}
	public TreeNode getRight(){
		return right;
	}
	public void setValue(int newValue) {
		this.value = newValue;
	}
}