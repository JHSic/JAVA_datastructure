public class ClubList {
	private ClubNode head;
	private int size=0;

	public ClubNode getHead() {
		return head;
	}
	public int getSize() {
		return size;
	}
	public void setHead(ClubNode head) {
		this.head = head;
	}
	
	public ClubList() {
		head = null;
	}
	
	public void addClub(String clubName) {
		ClubNode newNode = new ClubNode(clubName);
		
		if(size == 0) {
			head = new ClubNode(clubName);
		}
		else {
			ClubNode prev = head;
			head = newNode;
			newNode.setNext(prev);
		}
		size++;
	}
}