import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> result = new TreeMap<String, Integer>();

		String sentence = sc.nextLine().toLowerCase();
		String[] words = sentence.split("[^a-zA-Z]+");
		int bestCount = 1;
		int count = 1;
		
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count > bestCount) {
				bestCount = count;
			}
			if (!result.containsKey(words[i])) {
				result.put(words[i], count);
			}
		}
		
		for (String word : result.keySet()) {
			if (result.get(word) == bestCount) {
				System.out.printf(word + " -> " + bestCount + " times\n");
			}
		}
	}

}
