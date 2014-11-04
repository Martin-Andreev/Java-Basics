import java.util.Scanner;


public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numLength = sc.nextInt();
		double result;
		String[] typeArr = new String[numLength];
		Double[] numberArr = new Double[numLength];
		
		for (int i = 0; i < numLength; i++) {
			numberArr[i] = sc.nextDouble();
			typeArr[i] = sc.next();
		}
		
		for (int i = 0; i < numLength; i++) {
			if (typeArr[i].toString().equals("deg")) {
				result = Math.toRadians(numberArr[i]);
				System.out.printf("%.6f rad \n", result);

			}
			else {
				result = Math.toDegrees(numberArr[i]);
				System.out.printf("%.6f deg \n", result);
			}
		}
	}

}
