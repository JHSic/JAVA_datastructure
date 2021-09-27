public class DoublyCircularLinkedList {

	private StudentNode head;
	private int size;
	
	public StudentNode getHead() {
		return head;
	}
	public void setHead(StudentNode head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public DoublyCircularLinkedList() {
		head = new StudentNode(null, null, null);
		size = 0;
	}
	
	public int compareNode(String studentNum) {
		StudentNode current = head.getNext();
		
		int comparison = 0;
		while(current.getNext() != head.getNext()) {
			if(Integer.parseInt(studentNum) < Integer.parseInt(current.getStudentNum())) {
				return comparison;
			}
			comparison++;
			current = current.getNext();
		}
		return -1;
	}
	
	public void addFirst(StudentNode newNode) {
		head.setNext(newNode);
		head.setPrev(newNode);
		newNode.setPrev(head);
		newNode.setNext(head);
		size++;
	}
	
	public void addLast(StudentNode newNode, StudentNode current) {
		newNode.setPrev(current);
		current.setNext(newNode);
		newNode.setNext(head);
		head.setPrev(newNode);
		size++;
	}
	
	public void addBetween(StudentNode newNode, StudentNode prev, StudentNode current) {
		newNode.setPrev(prev);
		newNode.setNext(current);
		prev.setNext(newNode);
		current.setPrev(newNode);
		size++;
	}
	
	public void addStudent(String studentNum, String studentName) {
		StudentNode newNode = new StudentNode(studentNum, studentName);
		
		if(size == 0) {
			addFirst(newNode);
		}
		else {
			StudentNode current = head.getNext();
			StudentNode prev = head;
			
			int comparisonCount = compareNode(newNode.getStudentNum());
			
			switch(comparisonCount) {
			case -1:
				while(current.getNext() != head) {
					current = current.getNext();
				}
				
				addLast(newNode, current);
				break;

			case 0:
				addBetween(newNode, prev, current);
				current = newNode;
				break;

			default:
				for(int i = 0; i < comparisonCount; i++) {
					prev = current;
					current = current.getNext();
				}
				
				addBetween(newNode, prev, current);
				break;
			}
		}
	}
	
	public void removeFirst(StudentNode prev, StudentNode current) {
		prev.setNext(current.getNext());
		current.getNext().setPrev(prev);
		size--;
	}
	
	public void removeLast(StudentNode prev) {
		head.setPrev(prev.getPrev());
		prev.getPrev().setNext(head);
		size--;
	}
	
	public void removeStudent(String removeNum) {
		StudentNode current = head.getNext();
		StudentNode prev = head;
		
		while(current != null) {
			if(Integer.parseInt(removeNum) == Integer.parseInt(current.getStudentNum())) {
				if(prev == head) {
					removeFirst(prev, current);
					return;
				}
				else if(current == head) {
					removeLast(prev);
					return;
				}
				else {
					removeFirst(prev, current);
					return;
				}
			}
			prev = current;
			current = current.getNext();
		}
	}
	
	public void printMenu(){
		System.out.println("==========================================");
		System.out.println("(1) 새 학생 입력\r\n" + "(2) 학생 삭제\r\n" + "(3) 학번 순으로 전체 출력\r\n" + "(4) 학번 역순으로 전체 출력\r\n" + "(5) 특정 학번부터 전체 출력\r\n" + "(6) 파일에 저장하고 종료\r\n");
		System.out.println("==========================================");
	}
	
	public StringBuilder printStudent() {
		StudentNode current = head.getNext();
		
		StringBuilder sb = new StringBuilder();
		
		while(current != head) {
			if(current.getNext() == head.getNext()){
				break;
			}
           			sb.append(current.getStudentNum() + " " + current.getStudentName() + "\n");
            
            		current = current.getNext();
       		}
		return sb;
	}
	
	public void reversePrint() {
		StudentNode current = head.getPrev();
		
		while(current != head){
            		System.out.println(current.getStudentNum() + " " + current.getStudentName());
            
            		current = current.getPrev();
        		}
	}

	public void specificStudentPrint(String specificNum) {
		StudentNode current = head.getNext();
		
		for(int i = 0; i < size; i++) {
			if(Integer.parseInt(specificNum) == Integer.parseInt(current.getStudentNum())) {
				for(int j = 0; j < size; j++) {
					if(current.getStudentNum() != null) {
						System.out.println(current.getStudentNum() + " " + current.getStudentName());
						current = current.getNext();
					}
					else {
						current = head.getNext();
						System.out.println(current.getStudentNum() + " " + current.getStudentName());
						current = current.getNext();
					}
				}
			}
			current = current.getNext();
		}
	}
}