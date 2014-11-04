import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _07_CountSubstringOccurrences {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		text = text.toLowerCase();
		String givenWord = sc.nextLine();
		givenWord = givenWord.toLowerCase();
		String currWord;
		int count = 0;		
		
		for (int i = 0; i < text.length() - givenWord.length() + 1; i++) {
			currWord = text.substring(i, i + givenWord.length());
			
			if (currWord.equals(givenWord)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
