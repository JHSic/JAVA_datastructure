public class PolynomialExecute {
	public static void main(String[] args) {
	
		System.out.println("ù��° ���׽��� ���-���� ������ �Է��ϼ���.(������ 0���� �ԷµǸ� ����)");
		Polynomial polynomial1 = new Polynomial();
		polynomial1.insert();
		
		System.out.println("�ι�° ���׽��� ���-���� ������ �Է��ϼ���.(������ 0���� �ԷµǸ� ����)");
		Polynomial polynomial2 = new Polynomial();
		polynomial2.insert();
		
		Polynomial result = new Polynomial();
		result = polynomial1.multiplyPolynomial(polynomial1, polynomial2);
		System.out.print("�� ���׽��� ���� : ");
		result.printResult();
	} 
}