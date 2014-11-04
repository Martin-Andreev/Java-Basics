import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arrElements = input.split(" ");
		String currWord;
		String nextWord;
		String bestWord = arrElements[0];
		int counter = 1;
		int maxCount = 1;

		for (int i = 0; i < arrElements.length - 1; i++) {
			currWord = arrElements[i];
			nextWord = arrElements[i + 1];

			if (currWord.equals(nextWord)) {
				counter++;

				if (counter > maxCount) {
					bestWord = arrElements[i];
					maxCount = counter;
				}
			}

			else {
				counter = 1;
			}
		}

		for (int i = 0; i < maxCount; i++) {
			System.out.printf("%s ", bestWord);
		}
	}

}
