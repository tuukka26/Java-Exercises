import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter initial deposit: ");
		double initialDeposit = readDouble(input);

		System.out.print("Enter interest rate: ");
		double interestRate = readDouble(input);

		System.out.print("Enter capital income tax rate: ");
		double taxRate = readDouble(input);

		System.out.print("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());
		
		System.out.println("");
		
		double interest = initialDeposit * (interestRate / 100);
		double afterTax = interest * (1 - (taxRate / 100));
		double sum = initialDeposit + afterTax;

		for (int i = 1; i <= years; i++) {

			System.out.println(i + ": " + twoDecimals.format(sum));
			sum += sum * (interestRate / 100) * (1 - (taxRate / 100));

		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
