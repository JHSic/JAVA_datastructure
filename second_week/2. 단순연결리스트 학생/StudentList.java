public class StudentList {
	
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

	public StudentList() {
		head = null;
		size = 0;
	}
	
	public int compareNode(String studentNum) {
		StudentNode current = head;
		
		int comparison = 0;
		while(current != null) {
			if(Integer.parseInt(studentNum) < Integer.parseInt(current.getStudentNum())) {
				return comparison;
			}
			comparison++;
			current = current.getNext();
		}
		return -1;
	}
	
	public void addFirst(StudentNode newNode) {
		newNode.setNext(head);
		head = newNode;
		size++;
	}
	
	public void addLast(StudentNode current, StudentNode newNode) {
		while(current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(newNode);
		size++;
	}
	
	public void addBetween(StudentNode prev, StudentNode current, StudentNode newNode, int comparisonCount) {
		for(int i = 0; i < comparisonCount; i++) {
			prev = current;
			current = current.getNext();
			size++;
		}
		
		prev.setNext(newNode);
		newNode.setNext(current);
	}
	
	public void addStudent(String studentNum, String studentName, ClubList clubList) {
		StudentNode newNode = new StudentNode(studentNum, studentName, clubList);
		
		if(size == 0) {
			addFirst(newNode);
		}
		else {
			StudentNode current = head;
			StudentNode prev = null;
			
			int comparisonCount = compareNode(newNode.getStudentNum());
			
			switch(comparisonCount) {
			case -1:
				addLast(current, newNode);
				break;
			
			case 0:
				addFirst(newNode);
				break;
				
			default:
				addBetween(prev, current, newNode, comparisonCount);
				break;
			}
		}
	}
	
	public void removeFirst() {
		head = head.getNext();
		size--;
	}
	
	public void removeOther(StudentNode prev, StudentNode current) {
		prev.setNext(current.getNext());
		size--;
	}
	
	public void removeStudent(String removeNum) {
		StudentNode current = head;
		StudentNode prev = null;
		
		while(current != null) {
			if(Integer.parseInt(removeNum) == Integer.parseInt(current.getStudentNum())) {
				if(prev == null) {
					removeFirst();
					return;
				}
				else {
					removeOther(prev, current);
					return;
				}
			}
			prev = current;
			current = current.getNext();
		}
	}
	
	public void printMenu(){
		System.out.println("==========================================");
		System.out.println("(1) 새 학생 입력\r\n" + "(2) 학생 삭제\r\n" + "(3) 학번 순으로 전체 출력\r\n" + "(4) 파일에 저장하고 종료");
		System.out.println("==========================================");
	}
	
	public StringBuilder printStudent() {
         		StudentNode current = head;
         
         		StringBuilder sb = new StringBuilder();
         
         		while(current != null) {
            		sb.append(current.getStudentNum() + " " + current.getStudentName() + " ");
               
            		if(current.getClubList().getHead() == null) {
               			sb.append("\n");
               			current = current.getNext();
            		}
            		else {
               			if(current.getClubList().getHead().getClubName() != null) {
                 				sb.append(current.getClubList().getHead().getClubName());
              			}
               			ClubNode clubCurrent = current.getClubList().getHead();
               
               			while(clubCurrent.getNext()!=null) {
                  				sb.append("/" + clubCurrent.getNext().getClubName());
                  
                  				clubCurrent = clubCurrent.getNext();
               			}
               			sb.append("\n");
               			current = current.getNext();
            		}
         		}
         		return sb;
      	}
}