import java.util.Scanner;

public class SomaTransposta {
	
	public static void getMatrix(int[][] matrix, int size) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < size ; i ++) {
			for(int j = 0 ; j < size ; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void printTranspose(int[][] matrix, int size) {
		for(int i = 0 ; i < size ; i++) {
			for(int j = 0 ; j < size ; j++) {
				System.out.print(matrix[i][j]+matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int matrix[][] = new int[n][n];
		
		getMatrix(matrix, n);
		printTranspose(matrix, n);
		
	}
}