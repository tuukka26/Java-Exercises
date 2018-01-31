import java.util.Scanner;
import java.text.DecimalFormat;

public class CarSharing {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter driven kilometers: ");
		int drivenKilometres = Integer.parseInt(input.nextLine());

		System.out.print("Enter fuel consumption per 100 km: ");
		double fuelConsumption = readDouble(input);

		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = readDouble(input);

		System.out.print("Enter number of people: ");
		int numberOfPeople = Integer.parseInt(input.nextLine());

		System.out.println();
		System.out.println("Each of the " + numberOfPeople + " people should pay "
				+ twoDecimals.format((fuelConsumption / 100) * fuelPrice * drivenKilometres / numberOfPeople)
				+ " euros.");

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
