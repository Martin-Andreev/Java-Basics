import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> result = new LinkedHashMap<String, Integer>();

		int count = 1;
		String sentence = sc.nextLine();
		String[] words = sentence.split("[^a-zA-Z0-9]+");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (!result.containsKey(words[i])) {
				result.put(words[i], count);
			}
		}
		
		for (String word : result.keySet()) {
			count = result.get(word);
			double percent = ((double)result.get(word) / words.length) * 100;
			System.out.printf("%s -> %.02f%%\n",word, percent);
		}
	}
}
