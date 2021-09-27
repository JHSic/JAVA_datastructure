package matrix;

public class Matrix {
	
	private int row;
	private int col;
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int[][] firstMatrix() {
		int[][] firstMat = new int[row][col];
		
		System.out.println("최초행렬");
		
		for(int i = 0; i < row; i++) {
			System.out.print("|\t");	
			
			for(int j = 0; j < col; j++) {
				firstMat[i][j] = (int) (999 * Math.random()+1);
				System.out.print(firstMat[i][j] + "\t");
			}
			System.out.println("|\t");
		}
		return firstMat;
	}

	public void rightRotate(int[][] matrix) {
		int[][] rightMat = new int[row][col];

		System.out.println("\n우측으로 90도 회전");
		
		for(int i = 0; i < rightMat.length; i++) {
			System.out.print("|\t");
			
			for(int j = 0; j < rightMat[i].length; j++) {
				rightMat[i][j] = matrix[matrix.length-j-1][i];	
				System.out.print(rightMat[i][j] + "\t");
			}	
			System.out.println("|\t");
		}
	}

	public void leftRotate(int[][] matrix) {
		int [][] leftMat = new int[row][col];
		
		System.out.println("\n좌측으로 90도 회전");
		
		for(int i = 0; i < leftMat.length; i++) {
			System.out.print("|\t");
			
			for(int j = 0; j < leftMat[i].length; j++) {
				leftMat[i][j] = matrix[j][matrix.length-i-1];
				System.out.print(leftMat[i][j] + "\t");
			}
			System.out.println("|\t");
		}
	}

	public void transpose(int[][] matrix) {
		int[][] transMat = new int[row][col];
		
		System.out.println("\n전치행렬");
		
		for(int i = 0; i < matrix.length; i++) {
			System.out.print("|\t");
			
			for(int j = 0; j < matrix.length; j++) {
				transMat[i][j] = matrix[j][i];
				System.out.print(transMat[i][j] + "\t");
			}
			System.out.println("|\t");
		}	
	}
}