public class ClubNode {
	private String clubName;
	private ClubNode next = null;
	
	public String getClubName() {
		return clubName;
	}
	public ClubNode getNext() {
		return next;
	}
	public void setClub(String clubName) {
		this.clubName = clubName;
	}
	public void setNext(ClubNode nextNode) {
		this.next = nextNode;
	}
	
	public ClubNode(String clubName, ClubNode nextNode) {
		this.clubName = clubName;
		this.next = nextNode;
	}
	public ClubNode(String clubName) {
		this.clubName = clubName;
	}
}