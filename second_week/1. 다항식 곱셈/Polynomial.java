import java.util.Scanner;

public class Polynomial {
	private Term[] termArray;
	private int terms;
	private int capacity;
	
	public int getTerms() {
		return terms;
	}
	public void setTerms(int terms) {
		this.terms = terms;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Term[] getTermArray() {
		return termArray;
	}
	public void setTermArray(Term[] termArray) {
		this.termArray = termArray;
	}
	
	public Polynomial() {
		terms = 0;
		capacity = 4;
		termArray = new Term[capacity];
	}
	public Polynomial(int capacity) {
		this.capacity = capacity;
		this.terms = 0;
		this.termArray = new Term[capacity];
	}

	public void insert() {
		while(true){
			Scanner s = new Scanner(System.in);

			double coef = s.nextDouble(); 
			int exp = s.nextInt();
			Term temp = new Term(coef, exp);
			
			if(terms == capacity) {
				resize(2 * capacity);
			}
			termArray[terms++] = temp;
			
			if(exp == 0) {
				break;
			}
		}
	}

	private void resize(int newCapacity) {
		Term[] newArr = new Term[newCapacity]; 
		
		for(int i = 0; i < capacity; i++) {	
			newArr[i] = termArray[i];
		}
		termArray = newArr;
	}

	public void insertResultPoly(double coef, int exp) {
		Term resultTerms = new Term(); 
		resultTerms.setCoef(coef);
		resultTerms.setExp(exp);
		
		termArray[terms] = resultTerms;
		terms++;
	}
	
	public Polynomial multiplyPolynomial(Polynomial polynomial1, Polynomial polynomial2) {
		Polynomial result = new Polynomial(polynomial1.getTerms() * polynomial2.getTerms());
		
		for(int i = 0; i < polynomial1.getTerms(); i++) {
			for(int j = 0; j < polynomial2.getTerms(); j++) {
				double coef = polynomial1.termArray[i].getCoef() * polynomial2.termArray[j].getCoef();
				int exp = polynomial1.termArray[i].getExp() + polynomial2.termArray[j].getExp();
				result.insertResultPoly(coef, exp);
			}
		}
		int termNum = result.getTerms();
		
		for(int i = 0; i < termNum; i++) {
			for(int j = i + 1; j < termNum; j++) {
				if(result.termArray[i].getExp() == result.termArray[j].getExp()) {
					result.termArray[i].setCoef(result.termArray[i].getCoef() + result.termArray[j].getCoef());

					for(int k = j; k < termNum - 1; k++) { 
						result.termArray[k].setCoef(result.termArray[k + 1].getCoef());
						result.termArray[k].setExp(result.termArray[k + 1].getExp());
					}
					termNum--; 				
				}
			}
		}
		result.setTerms(termNum); 
		result.setCapacity(termNum); 
		return result;
	}
	
	public void printResult() {
		for(int i = 0; i < capacity; i++) {
			if(termArray[i].getCoef() != 0) {
				if(termArray[i].getCoef() < 0 && termArray[i].getExp() != 0) {
					if(termArray[i].getCoef() == -1) {
						if(termArray[i].getExp() > 1) {
							System.out.printf(" - x^%d", termArray[i].getExp());
						}
						else {
							System.out.print(" - x");
						}
					}
					else {
						System.out.printf(" %1.0fx^%d", termArray[i].getCoef(), termArray[i].getExp());
					}
				}
				else if(termArray[i].getExp() == 1){
					if(termArray[i].getCoef() < 0) {
						System.out.printf(" %1.0fx", termArray[i].getCoef());
					}
					else if(termArray[i].getCoef() > 1){
						System.out.printf(" + %1.0fx", termArray[i].getCoef());
					}
					else {
						System.out.print(" + x");
					}
				}
				else if(termArray[i].getExp() == 0) {
					if(termArray[i].getCoef() > 0) {
						System.out.printf(" + %1.0f", termArray[i].getCoef());
					}
					else  {
						System.out.printf(" %1.0f", termArray[i].getCoef());
					}	
				}
				else if(termArray[i].getCoef() != 0) {
					if(i == 0) {
						if(termArray[i].getCoef() == 1)
							System.out.printf("x^%d", termArray[i].getExp());
						else {
							System.out.printf("%1.0fx^%d", termArray[i].getCoef(), termArray[i].getExp());
						}
					}
					else {
						if(termArray[i].getCoef() > 1) {
							System.out.printf(" + %1.0fx^%d", termArray[i].getCoef(), termArray[i].getExp());
						}
						else {
							System.out.printf(" + x^%d", termArray[i].getExp());
						}
					}
				}
			}
		}
	}
}