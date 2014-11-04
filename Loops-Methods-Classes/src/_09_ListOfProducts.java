import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.SortedMap;
import java.util.TreeMap;

public class _09_ListOfProducts {

	public static void main(String[] args) {
		SortedMap<Double, String> product = new TreeMap<>();

		try {
			readAndSort(product);

			print(product);

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static void print(SortedMap<Double, String> product)
			throws UnsupportedEncodingException, FileNotFoundException,
			IOException {
		BufferedWriter writer;
		writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("src/outputProducts.txt"), "utf-8"));

		for (Double key : product.keySet()) {
			writer.write("" + key + " -> " + product.get(key) + "\n");
		}
		writer.close();
	}

	private static void readAndSort(SortedMap<Double, String> product)
			throws FileNotFoundException, IOException {
		BufferedReader reader;
		String name;
		double price;
		reader = new BufferedReader(new FileReader("src/inputProducts.txt"));
		String line = reader.readLine();

		while (line != null) {
			name = line.substring(0, line.indexOf(' '));
			price = Double.parseDouble(line.substring(line.indexOf(' ')));
			product.put(price, name);
			line = reader.readLine();
		}
		reader.close();
	}
}
