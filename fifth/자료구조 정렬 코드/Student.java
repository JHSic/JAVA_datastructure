public class Student implements Comparable<Student>{
	private int korean;
	private int english;
	private int math;
	private int science;
	private int socialStudies;
	
	public double getAvg() {
		return (double)(korean + english + math + science + socialStudies)/5;
	}
	
	public Student(int korean, int english, int math, int science, int socialStudies) {
		super();
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
		this.socialStudies = socialStudies;
	}
	
	@Override
	public int compareTo(Student s) {
		return Double.compare(getAvg(), s.getAvg());
	}
}