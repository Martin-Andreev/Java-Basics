import java.util.Scanner;

public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ax: ");
		double ax = sc.nextDouble();
		System.out.print("Ay: ");
		double ay = sc.nextDouble();
		
		System.out.print("Bx: ");
		double bx = sc.nextDouble();
		System.out.print("By: ");
		double by = sc.nextDouble();
		
		System.out.print("Cx: ");
		double cx = sc.nextDouble();
		System.out.print("Cy: ");
		double cy = sc.nextDouble();
		
		double area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2 ;
		
		if ((ax == ay) && (bx == by) && (cx == cy)) {
			System.out.println(0);
		}
		else {
			System.out.print("Area: " + area);
		}
	}

}
