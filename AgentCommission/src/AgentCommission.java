import java.util.Scanner;
import java.text.DecimalFormat;

public class AgentCommission {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter selling price: ");
		double sellingPrice = readDouble(input);

		System.out.println();

		if (sellingPrice * 0.0344 < 2400.00) {
			System.out.println("The commission is 2400,00 euros.");
		} else {

			System.out.println("The commission is " + twoDecimals.format(sellingPrice * 0.0344) + " euros.");
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
