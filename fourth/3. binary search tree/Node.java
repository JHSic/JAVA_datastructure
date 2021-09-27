public class Node <Key extends Comparable<Key>> {
	private Key name;
	private Node left, right;
	
	public Node(Key newName) {
		this.name = newName;
		this.left = null;
		this.right = null;
	}
	
	public Key getKey() {
		return name;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
	public void setKey(Key newName) {
		this.name = newName;
	}
	public void setLeft(Node newLeft) {
		this.left = newLeft;
	}
	public void setRight(Node newRight) {
		this.right = newRight;
	}
}