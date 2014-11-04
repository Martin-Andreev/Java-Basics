import java.util.Scanner;

public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		System.out.print("Number of one bits: " + Integer.bitCount(num));
		
		/* SECOND WAY
		 
		int count = 0;
		int numLastDigit;
		
		while (num > 0) {
			numLastDigit = num & 1;
			num = num >> 1;
			
			if (numLastDigit == 1){
                count++;
            }
		}*/
	}

}
