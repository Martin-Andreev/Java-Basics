import java.util.Scanner;


public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int count = 0;
		int numPreLastDigit;
		int numLastDigit = num & 1;
		num = num >> 1;
		
		while (num > 0) {
			numPreLastDigit = numLastDigit;
			numLastDigit = num & 1;
			num = num >> 1;
			
			if (numPreLastDigit == numLastDigit) {
				count++;
			}
		}
		
		System.out.println("Result: " + count);
	}

}
