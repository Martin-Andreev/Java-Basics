import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Width: ");
		double width = sc.nextDouble();
		System.out.print("Height: ");
		double height = sc.nextDouble();
		
		double area = width * height;
		System.out.printf("The area of the rectangle is: %s", area);
	}
}
