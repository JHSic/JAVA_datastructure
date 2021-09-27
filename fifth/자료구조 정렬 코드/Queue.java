public class Queue<E> {

	public class Node<E> {

        private E item;
        private Node<E> nextNode;

        public E getItem(){
        	return item; 
        }
        public Node<E> getNext(){ 
        	return nextNode; 
        }

        public void setNext(Node<E> nextNode) {
        	this.nextNode = nextNode; 
        }

        public Node(E item, Node<E> node) {
            this.item = item;
            nextNode = node;
        }
    }

    private Node<E> front;
    private Node<E> rear = new Node<>(null, null);
    private int count;

    public int getCount() {
    	return count; 
    }

    public Queue(){
        count = 0;
    }

    public void enQueue(E data){
        Node<E> node;
        if(count == 0){
            rear = new Node<>(data,front);
            front = rear;
            front.setNext(rear);
        }
        else {
            node = new Node<>(data,front);
            rear.setNext(node);
            rear = node;
        }
        count++;
    }

    public E peek(){
    	return front.getItem(); 
    }

    public E deQueue(){
        E e = peek();
        if(count == 1){
            front = rear = new Node<>(null,null);
        }
        else{
            rear.setNext(front.getNext());
            front.setNext(null);
            front = rear.getNext();
        }
        count--;
        return e;
    }
}