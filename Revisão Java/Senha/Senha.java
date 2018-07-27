import java.util.Scanner;

public class Senha {
	
	public static boolean checkPass(String password) {
		boolean number = false, upperLetter = false, lowerLetter = false;
		
		
		if(password.length() > 36 || password.length() < 6) {
			return false;
		}
		
		for(int i = 0 ; i < password.length() ; i++) {
			if(password.charAt(i) >= 48 && password.charAt(i) <= 57) { // check number
				number = true;				
			} else if(password.charAt(i) >= 65 && password.charAt(i) <= 90){ // uppercase
				upperLetter = true;
			} else if(password.charAt(i) >= 97 && password.charAt(i) <= 122) { // lowercase
				lowerLetter = true;
			} else {
				return false;
			}
			
		}
		
		return number && upperLetter && lowerLetter;
		
	}
	
	public static void printResult(boolean isValid[], int n) {
		for(int i = 0 ; i < n ; i++) {
			if(isValid[i]) {
				System.out.println("Senha valida.");
			} else {
				System.out.println("Senha invalida.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		boolean isValid[] = new boolean [100];
		int i = 0;
		
		while(/*sc.hasNext()*/i != 6) {
			password = sc.next();
			isValid[i] = checkPass(password);
			i++;
		}
		
		printResult(isValid, i);
	}
}