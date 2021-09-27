public class StudentNode {
	private String studentNum;
	private String studentName;
	private StudentNode next;
	private StudentNode prev;
	
	public String getStudentNum() {
		return studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public StudentNode getNext() {
		return next;
	}
	public void setNext(StudentNode nextNode) {
		this.next = nextNode;
	}
	public StudentNode getPrev() {
		return prev;
	}
	public void setPrev(StudentNode prev) {
		this.prev = prev;
	}
	
	public StudentNode(String newStudent, StudentNode nextNode, StudentNode prevNode) {
		this.studentNum = newStudent;
		this.next = nextNode;
		this.prev = prevNode;
	}
	public StudentNode(String studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
}