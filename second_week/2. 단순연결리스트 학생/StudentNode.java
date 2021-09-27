public class StudentNode {
	private String studentNum;
	private String studentName;
	private StudentNode next;
	private ClubList clubList;
	
	public String getStudentNum() {
		return studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public StudentNode getNext() {
		return next;
	}
	public ClubList getClubList() {
		return clubList;
	}
	public void setNext(StudentNode nextNode) {
		this.next = nextNode;
	}
	
	public StudentNode(String newStudent, StudentNode nextNode) {
		this.studentNum = newStudent;
		this.next = nextNode;
	}
	public StudentNode(String studentNum, String studentName, ClubList clubList) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.clubList = clubList;
	}
	public StudentNode(ClubList clubList) {
		this.clubList = clubList;
	}
}