import java.util.EmptyStackException;

public class Stack<E> {
	
	private E[] tokenArr;
	private int top;
	
	public Stack() {
		tokenArr = (E[])(new Object[1]); 
		top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public E top() {
		if(isEmpty()) {
			return null;
		}
		return tokenArr[top];
	}
	
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return tokenArr[top];
	}
	
	public void push(E newToken) {
		if(size() == tokenArr.length) {
			resize(2 * tokenArr.length);
		}
		tokenArr[++top] = newToken;
	}
	
	public E pop() {
		if(isEmpty()) throw new EmptyStackException();
		E topToken = tokenArr[top];
		tokenArr[top--] = null;
		if(size() > 0 && size() == tokenArr.length / 4) {
			resize(tokenArr.length / 2);
		}
		return topToken;
	}
	
	private void resize(int newSize) {
		Object[] newTokenArr = new Object[newSize];
		
		for(int i = 0; i < size(); i++) {
			newTokenArr[i] = tokenArr[i];
		}
		tokenArr = (E[]) newTokenArr;
	}
}