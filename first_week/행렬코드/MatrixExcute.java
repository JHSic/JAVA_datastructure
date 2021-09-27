package matrix;

public class MatrixExcute {
	public static void main(String[] args) {
		
		Matrix srcMat = new Matrix(4, 4);
		
		int[][] matrix = srcMat.firstMatrix();
		
		srcMat.rightRotate(matrix);
		srcMat.leftRotate(matrix);
		srcMat.transpose(matrix);	
	}
}