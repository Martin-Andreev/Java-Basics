import java.util.ArrayList;

public class _03_FullHouse {

	public static void main(String[] args) {
		String[] face = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suits = { "\u2663", "\u2666", "\u2665", "\u2660" };
		ArrayList<String> allCards = new ArrayList<>();
		String card = "";
		int count = 0;

		for (int i = 0; i < face.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				card = face[i] + suits[j];
				allCards.add(card);
			}
		}

		for (int i = 0; i < allCards.size(); i++) {
			char card1 = allCards.get(i).charAt(0);

			for (int j = i + 1; j < allCards.size(); j++) {
				char card2 = allCards.get(j).charAt(0);

				for (int k = j + 1; k < allCards.size(); k++) {
					char card3 = allCards.get(k).charAt(0);

					if ((card1 == card2) && (card2 == card3)) {

						for (int l = 0; l < allCards.size() - 1; l++) {
							char card4 = allCards.get(l).charAt(0);

							if (card4 != card3) {
								for (int m = l + 1; m < allCards.size(); m++) {
									char card5 = allCards.get(m).charAt(0);

									if (card4 == card5) {
										System.out.println(allCards.get(i)
												+ " " + allCards.get(j) + " "
												+ allCards.get(k) + " "
												+ allCards.get(l) + " "
												+ allCards.get(m));
										count++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
