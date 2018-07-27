import java.util.Scanner;

public class MatrizOrdenada {
	
	public static void getMatrix(int[][] matrix, int size) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < size ; i ++) {
			for(int j = 0 ; j < size ; j++) {
				matrix[j][i] = sc.nextInt();
			}
		}
			
		
	}
	
	public static void sort(int[] vet, int size) {
		int lower = 0;
		int aux;
		
		for(int j = 0 ; j < size ; j++) {
			for(int i = j ; i < size ; i++) {
				if(vet[i] < vet[lower]) {
					lower = i;			
				}
			}
			aux = vet[lower];
			vet[lower] = vet[j];
			vet[j] = aux;
			lower = j+1;
		}
		
	}
	
	public static void sortMatrix(int[][] matrix, int size) {
		for(int i = 0 ; i < size ; i++) {
			sort(matrix[i], size);
		}
	}
	
	public static void printMatrix(int[][] matrix, int size) {
		for(int i = 0 ; i < size ; i++) {
			for(int j = 0 ; j < size ; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[][] matrix = new int [n][n];
		
		getMatrix(matrix, n);
		sortMatrix(matrix, n);
		printMatrix(matrix, n);
	}
}