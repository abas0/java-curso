package application;

import java.util.Scanner;

import entities.MatrixMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int column = sc.nextInt();
		int line = sc.nextInt();
		int matrix[][] = new int[column][line];
		for(int i = 0; i < column; i++) {
			for(int j = 0; j< line; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int num = sc.nextInt();
		MatrixMap matrixMap = new MatrixMap(num);
		System.out.println(matrixMap.exists(num, matrix));
		matrixMap.validateEdges(matrixMap.exists(num, matrix), matrix, num);
		sc.close();
	}

}
