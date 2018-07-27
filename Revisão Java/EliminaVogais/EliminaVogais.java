import java.util.Scanner;

public class EliminaVogais {
	
	public static String checkWord(String word) {
		int counter = 0;
		String result = "0 ";
		
		for(int i = 0 ; i < word.length() ; i++) {
			if(word.charAt(i) == 65 || word.charAt(i) == 97 || word.charAt(i) == 69 || word.charAt(i) == 101 || word.charAt(i) == 73 || word.charAt(i) == 105 || word.charAt(i) == 79 || word.charAt(i) == 111 || word.charAt(i) == 85 || word.charAt(i) == 117) {
				counter++;
			} else {
				result += word.charAt(i);
			}
		}
		
		//result.charAt(0) = (char)counter;
		return counter+result.substring(1, result.length());
		
	}
	
	public static void printResult(String[] toPrint, int n) {
		for(int i = 0 ; i < n ; i ++) {
			System.out.println(toPrint[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		String[] toPrint = new String [100];
		int i = 0;
		
		while(/*sc.hasNext()*/i != 6) {
			word = sc.next();
			toPrint[i] = checkWord(word);
			i++;
		}
		
		printResult(toPrint, i);
	}
}