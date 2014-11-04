import java.util.Arrays;
import java.util.Scanner;

public class _08_SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the array: ");
		
		int arrLength = sc.nextInt();
		String[] nameArr = new String[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			nameArr[i] = sc.next();
		}
		
		Arrays.sort(nameArr);
		System.out.println("\nResult:");
		
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
	}
}
