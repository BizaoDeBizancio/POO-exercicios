import java.util.Scanner;

public class Consoantes {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		char c;
		do {
			c = sc.next().charAt(0);
			c = Character.toLowerCase(c);
			if(c >= 'b' && c <= 'z' && (c != 'e' && c != 'i' && c != 'o' && c != 'u')) {
				i++;
			}
		} while(c != '*');
		
		if(i <= 0) {
			System.out.println(0);
		} else {
			System.out.println(i);
		}
	}
}