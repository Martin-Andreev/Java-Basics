import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_GenerateLetterWords {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = sc.next();
		String currWord = "";
		String[] wordsArr = word.split("");
		Set<String> set = new TreeSet<String>();
		
		for (String firstLetter : wordsArr) {
			for (String secondLetter : wordsArr) {
				for (String thirdLetter : wordsArr) {
					currWord = firstLetter + secondLetter + thirdLetter;
					
					set.add(currWord);
				}
			}
		}
		
		set.stream().forEach(x -> System.out.printf("%s ", x));
		
	}

}
