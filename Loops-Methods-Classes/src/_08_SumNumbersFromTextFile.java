import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
			String line = reader.readLine();
			
			while (line != null) {
				num = Integer.parseInt(line);
				sum += num;
				line = reader.readLine();
			}
			
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
