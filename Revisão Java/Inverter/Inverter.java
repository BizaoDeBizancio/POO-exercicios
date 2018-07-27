import java.util.Scanner;

public class Inverter {
	public static void getNumbers(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = numbers.length - 1; i >= 0 ; i--) {
			numbers[i] = sc.nextInt();
		}
		
	}
	
	public static void printNumbers(int[] numbers) {
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.print(numbers[i]);
			if(i != numbers.length - 1) {
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
		
	}
	
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int numbers[] = new int [num];
		
		getNumbers(numbers);
		printNumbers(numbers);
		
	}	
}