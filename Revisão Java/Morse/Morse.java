import java.util.Scanner;

public class Morse {
	public static String charToMorse(char c) {
		switch (c) {
			case 'a':
			return ".-";
			//break;
			
			
			case 'b':
			return "-...";
			//break;
			
			
			case 'c':
			return "-.-.";
			//break;
			
			
			case 'd':
			return "-..";
			//break;
			
			
			case 'e':
			return ".";
			//break;
			
			
			case 'f':
			return "..-.";
			//break;
			
			
			case 'g':
			return "--.";
			//break;
			
			
			case 'h':
			return "....";
			//break;
			
			
			case 'i':
			return "..";
			//break;
			
			
			case 'j':
			return ".---";
			//break;
			
			
			case 'k':
			return "-.-";
			//break;
			
			
			case 'l':
			return ".-..";
			//break;
			
			
			case 'm':
			return "--";
			//break;
			
			
			case 'n':
			return "-.";
			//break;
			
			
			case 'o':
			return "---";
			//break;
			
			
			case 'p':
			return ".--.";
			//break;
			
			
			case 'q':
			return "--.-";
			//break;
			
			
			case 'r':
			return ".-.";
			//break;

			
			case 's':
			return "...";
			//break;
			
			
			case 't':
			return "-";
			//break;
			
			
			case 'u':
			return "..-";
			//break;
			
			
			case 'v':
			return "...-";
			//break;
			
			
			case 'w':
			return ".--";
			//break;
			
			
			case 'x':
			return "-..-";
			//break;
			
			
			case 'y':
			return "-.--";
			//break;
			
			
			case 'z':
			return "--..";
			//break;
			
			
			case '0':
			return "-----";
			//break;
			
			
			case '1':
			return ".----";
			//break;
			
			
			case '2':
			return "..---";
			//break;
			
			
			case '3':
			return "...--";
			//break;
			
			
			case '4':
			return "....-";
			//break;
			
			
			case '5':
			return ".....";
			//break;
			
			
			case '6':
			return "-....";
			//break;
			
			
			case '7':
			return "--...";
			//break;
			
			
			case '8':
			return "---..";
			//break;
			
			
			case '9':
			return "----.";
			//break;
			
		}
		return ""+c;
	}
	
	public static String converter(String word) {
		String inMorse = "";
		
		for(int i = 0 ; i < word.length() ; i++) {
			inMorse += charToMorse(word.charAt(i))+" ";
		}
		
		return inMorse;
		
		
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nWords;
		nWords = sc.nextInt();
		String[] words = new String [nWords];
			
		
		while(nWords != 0) {
			words[nWords - 1] = sc.next();
			words[nWords - 1] = converter(words[nWords - 1].toLowerCase());
			nWords--;
		}
		
		for(int i = words.length - 1; i >= 0 ; i--) {
			System.out.println(words[i]);
		}
		
	}
}