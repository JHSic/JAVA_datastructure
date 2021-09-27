public class Term {
	private double coef;
	private int exp;
	
	public double getCoef() {
		return coef;
	}
	public void setCoef(double coef) {
		this.coef = coef;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public Term(double coef, int exp) {
		this.coef = coef;
		this.exp = exp;
	}
	public Term() {
	}
}