import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _09_CombineListsOfLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text1 = sc.nextLine();
		String text2 = sc.nextLine();

		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		ArrayList<Character> result = new ArrayList<>();

		boolean isDifferent = false;

		
		for (int i = 0; i < text1.length(); i++) {
			if (text1.charAt(i) != ' ') {
				result.add(text1.charAt(i));

			}
		}

		for (int i = 0; i < text2.length(); i++) {
			if (text2.charAt(i) != ' ') {
				l2.add(text2.charAt(i));
			}
		}

		for (Character letter : l2) {
			for (Character element : result) {
				if (letter != element) {
					isDifferent = true;
				} else {
					isDifferent = false;
					break;
				}
			}
			if (isDifferent) {
				result.add(letter);
			}

			isDifferent = false;
		}

		for (Character character : result) {
			System.out.printf("%s ", character);
		}
	}
}
