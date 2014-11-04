import java.util.Scanner;

public class _06_FormattingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First number(0 <= a <= 500: ");
		int num1 = sc.nextInt();
		
		System.out.print("Second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Third number: ");
		double num3 = sc.nextDouble();
		
		String num1Hex = Integer.toHexString(num1).toUpperCase();
		String num1Bin = String.format("%10s", Integer.toBinaryString(num1)).replace(" ", "0");
		
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",num1Hex,num1Bin,num2,num3);
	}
	
}