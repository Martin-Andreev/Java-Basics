import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> text = new TreeSet<>();
		
		String sentence = sc.nextLine().toLowerCase();
		
		String[] result = sentence.split("[^a-zA-Z]+");
		
		for (int i = 0; i < result.length; i++) {
			text.add(result[i]);
		}
		
		for (String string : text) {
			System.out.printf("%s ", string);
		}

	}

}
