import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arrElements = input.split(" ");
		String currWord;
		String previousWord;
		
		if (arrElements.length == 1) {
			System.out.println(arrElements[0]);
		}
		
		else {
			System.out.printf("%s ", arrElements[0]);
			
			for (int i = 1; i < arrElements.length; i++) {
				currWord = arrElements[i];
				previousWord = arrElements[i - 1];
				
				if (!currWord.equals(previousWord)) {
					System.out.printf("\n%s ", currWord);
				} else {
					System.out.printf("%s ", currWord);
				}
			}
		}
	}
}
