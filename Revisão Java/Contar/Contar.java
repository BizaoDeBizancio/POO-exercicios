import java.util.Scanner;

public class Contar {
	public static void getNumbers(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length ; i++) {
			numbers[i] = sc.nextInt();
		}
		
	}
	
	public static int verify(int[] numbers, int X) {
		int counter = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			if(numbers[i] >= X) {
				counter++;
			}
		}
		return counter;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numbers[] = new int [num];
		getNumbers(numbers);
		int X = sc.nextInt();
		System.out.println(verify(numbers, X));
	}
}