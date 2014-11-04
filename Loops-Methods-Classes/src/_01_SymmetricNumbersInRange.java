import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		int firstDigit;
		int secondDigit;
		int thirdDigit;

		for (int i = startNum; i <= endNum; i++) {
			firstDigit = (i / 100) % 10;
			secondDigit = (i / 10) % 10;
			thirdDigit = i % 10;

			if (i < 10) {
				System.out.print(i + " ");
			} else if (i >= 10 && i < 100) {
				if (secondDigit == thirdDigit) {
					System.out.print(i + " ");
				}
			} else {
				if (firstDigit == thirdDigit) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
