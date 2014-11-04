import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class _06_RandmCardHands {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int numLength = sc.nextInt();
		String[] suits = { "\u2663", "\u2666", "\u2665", "\u2660" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };	
		String card;
		for (int i = 0; i < numLength; i++) {
			for (int j = 0; j < 5; j++) {
				card = rank[rnd.nextInt((13 - 0) + 0)] + (suits[rnd.nextInt((4 - 0))]);
				System.out.print(card + " ");
			}
			System.out.println();
		}
	}
}
