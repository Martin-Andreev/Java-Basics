import java.util.Scanner;

public class _04_TheSmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Third number: ");
		double num3 = sc.nextDouble();
		
		double smallest = Math.min(num1, Math.min(num2, num3));
		
		System.out.print("Smallest: " + smallest);
	}

}
