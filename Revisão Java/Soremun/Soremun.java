import java.util.Scanner;

public class Soremun {
	public static String reverse(int num) {
		String reversed = "";
		
		while (num > 0) {
			reversed = (reversed + num%10);
			num /=10;
			
		}
		return reversed;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(reverse(num));
	
	}
	
}
	