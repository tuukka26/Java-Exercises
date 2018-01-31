import java.util.Scanner;
import java.text.DecimalFormat;

public class DrivingCost {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter driven kilometers: ");
		int drivenKilometres = Integer.parseInt(input.nextLine());

		System.out.print("Enter amount of fuel consumed: ");
		double fuelConsumed = readDouble(input);
		
		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = readDouble(input);
		
		System.out.println();
		System.out.println("The cost per kilometer is " + twoDecimals.format((fuelConsumed * fuelPrice) / drivenKilometres) + " euros.");
		
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
