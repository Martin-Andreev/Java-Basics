import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numLength = sc.nextInt();
		Integer[] numbers = new Integer[numLength];
		int min;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[min]) {
					min = j;
				}
			}
			temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;
		}
		
		for (int element: numbers) {
			System.out.printf("%d ", element);
		}
	}

}
