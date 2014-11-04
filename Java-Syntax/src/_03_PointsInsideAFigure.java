import java.util.Scanner;


public class _03_PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ax: ");
		double ax = sc.nextDouble();
		System.out.print("Ay: ");
		double ay = sc.nextDouble();
		
		if ((isInSquare(ax, ay) || isInRectangle(ax, ay) || isInRec(ax, ay)) == true) {
			System.out.print("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

	public static boolean isInSquare(double ax, double ay){
		boolean result = false;
		
		if (ax >= 12.5 && ax <= 17.5) {
			if (ay >= 8.5 && ay <= 13.5) {
				result = true;
			}
		}
		return result;
	}
	
	public static boolean isInRectangle(double ax, double ay){
		boolean result = false;
		
		if (ax >= 12.5 && ax <= 22.5) {
			if (ay >= 6 && ay <= 8.5) {
				result = true;
			}
		}
		return result;
	}
	
	public static boolean isInRec(double ax, double ay){
		boolean result = false;
		
		if (ax >= 20 && ax <= 22.5) {
			if (ay >= 8.5 && ay <= 13.5) {
				result = true;
			}
		}
		return result;
	}
}
