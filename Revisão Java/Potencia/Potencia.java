import java.util.Scanner;

public class Potencia {
	public static long pot(long a, long n) {
		if(n == 0) {
			return 1;
		}
		
		return a*pot(a, n-1);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		long a = sc.nextInt();
		long n = sc.nextInt();
		
		System.out.println(pot(a, n));
	}
}