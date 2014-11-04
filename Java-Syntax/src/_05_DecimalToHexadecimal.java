import java.util.Scanner;

public class _05_DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num1 = sc.nextInt();
		
		System.out.printf("Hexadecimal: %X", num1);	
	}
}
