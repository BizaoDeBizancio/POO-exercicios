import java.util.Scanner;

public class ProdEsc {
	public static void getVector(int[] v, int size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < size ; i++) {
			v[i] = sc.nextInt();
		}
	}
	
	public static int product(int[] A, int[] B, int size) {
		int result = 0;
		for(int i = 0 ; i < size ; i++) {
			result += A[i]*B[i];
		}
		return result;
		
	}
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int [n];
		int[] B = new int [n];
		getVector(A, n);
		getVector(B, n);
		
		System.out.println(product(A, B, n));
	
	}
}