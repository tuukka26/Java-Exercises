import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountPrice {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter original price: ");
		double originalPrice = readDouble(input);
		
		System.out.print("Enter discount percentage: ");
		double discountPercentage = readDouble(input);
		
		System.out.println();
		System.out.println("The final price is " + twoDecimals.format(originalPrice - (discountPercentage / 100 * originalPrice)));
		
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
