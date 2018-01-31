import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalPlaces {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		double decimalNumber = readDouble(input);

		System.out.println();
		System.out.println(twoDecimals.format(decimalNumber));

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}