import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String wantedWord = sc.nextLine();
		input = input.toLowerCase();
		wantedWord = wantedWord.toLowerCase();
		
		String[] arrText = input.split("[ ,.!?\\-'\\(\\);]+");
		
		int count = 0;
		
		for (int i = 0; i < arrText.length; i++) {
			if (arrText[i].equals(wantedWord)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
