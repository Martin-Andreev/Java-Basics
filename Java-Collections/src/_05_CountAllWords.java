import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arrText = input.split("[ ,.!?\\-'\\(\\);]+");
		
		System.out.println(arrText.length);
	}

}
