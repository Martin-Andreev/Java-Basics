import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arrElements = input.split(" ");
		int currNum;
		int previousNum;
		int counter = 1;
		int maxCounter = 1;
		int bestStart = 0;
		
		System.out.printf("%s ", arrElements[0]); 
		
		for (int i = 1; i < arrElements.length; i++) {
			currNum = Integer.parseInt(arrElements[i]);
			previousNum = Integer.parseInt(arrElements[i - 1]);
			
			if (currNum > previousNum) {
				System.out.printf("%s ", currNum);
				counter++;
				if (counter >= maxCounter) {
					maxCounter = counter;
					bestStart = i - maxCounter;
				}
			} else {
				System.out.printf("\n%s ", currNum);
				counter = 1;
			}
		}
		
		System.out.print("\nLongest: " );
		for (int i = bestStart + 1; i < bestStart + 1 + maxCounter; i++) {
			System.out.printf("%s ", arrElements[i]);
		}
	}

}
