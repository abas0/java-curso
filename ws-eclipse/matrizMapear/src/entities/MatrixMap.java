package entities;

public class MatrixMap {
	private int num;

	public MatrixMap(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public boolean exists(int num, int matrix[][]){
		int count = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j< matrix[i].length; j++) {
				if(matrix[i][j] == num) {
					//System.out.println("AQUI! " + i + " " + j);
					count++;
				}
			}
		}
		if(count > 0) {
			return true;
		}
		return false;
		
	}
	public void validateEdges(boolean exists, int matrix[][], int num){
		if(exists == true) {
			
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[i].length; j++) {
					if(num == matrix[i][j]) {
						System.out.println("Position: " + i + ", " + j);
						if(i != 0) {
							System.out.println("Up: " + matrix[i-1][j]);
						}
						if(i != (matrix.length-1)) {
							System.out.println("Down: " + matrix[i+1][j]);
						}
						if(j != (matrix[i].length-1)) {
							System.out.println("Right: " + matrix[i][j+1]);
						}
						if(j != 0){
							System.out.println("Left: " + matrix[i][j-1]);
						}
					}
					
				}
			}
		}
	}
}
