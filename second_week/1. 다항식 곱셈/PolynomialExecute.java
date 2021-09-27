public class PolynomialExecute {
	public static void main(String[] args) {
	
		System.out.println("첫번째 다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료)");
		Polynomial polynomial1 = new Polynomial();
		polynomial1.insert();
		
		System.out.println("두번째 다항식을 계수-지수 쌍으로 입력하세요.(지수가 0으로 입력되면 종료)");
		Polynomial polynomial2 = new Polynomial();
		polynomial2.insert();
		
		Polynomial result = new Polynomial();
		result = polynomial1.multiplyPolynomial(polynomial1, polynomial2);
		System.out.print("두 다항식의 곱은 : ");
		result.printResult();
	} 
}