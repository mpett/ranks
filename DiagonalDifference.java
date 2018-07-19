package ranks;

import java.util.*;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int diagonalDifference = 0;
		int[][] inputMatrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int input = scanner.nextInt();
				inputMatrix[i][j] = input;
			}
		}
		
		for (int i = 0; i < n; i++) {
			diagonalDifference += inputMatrix[i][i];
			diagonalDifference -= inputMatrix[i][n-i-1];
		}
			
		diagonalDifference = 
				Math.abs(diagonalDifference);
		
		System.out.println(diagonalDifference);
	}
}
