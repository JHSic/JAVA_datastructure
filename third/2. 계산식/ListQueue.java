import java.util.NoSuchElementException;

public class ListQueue<E> {
	private Node<E> front, rear;
	private int size;
	
	public ListQueue() {
		front = rear = null;
		size = 0;
	}
	
	private static class Node<E> {
		private E token;
		private Node<E> next;
		
		public E getToken() {
			return token;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		public Node(E newToken, Node<E> next) {
			this.token = newToken;
			this.next = next;
		}
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void enqueue(E token) {
		Node newToken = new Node(token, null);
		if(isEmpty()) {
			front = newToken;
		}
		else {
			rear.setNext(newToken);
		}
		rear = newToken;
		size++;
	}
	
	public E dequeue() {
		if(isEmpty()) throw new NoSuchElementException();
		E frontToken = front.getToken();
		front = front.getNext();
		if(front == null) {
			rear = null;
		}
		size--;
		return frontToken;
	}
}