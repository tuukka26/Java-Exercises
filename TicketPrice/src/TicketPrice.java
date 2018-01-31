import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketPrice {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter price for a single ticket: ");
		double singleTicket = readDouble(input);

		System.out.print("Enter price for a season ticket: ");
		double seasonTicket = readDouble(input);

		System.out.print("Enter the number of bus trips per month: ");
		int amountOfTrips = Integer.parseInt(input.nextLine());

		System.out.println();

		if (singleTicket * amountOfTrips > seasonTicket) {

			System.out.println("Buying a season ticket is "
					+ twoDecimals.format((singleTicket * amountOfTrips) - seasonTicket) + " euros cheaper.");
		} else if (singleTicket * amountOfTrips == seasonTicket) {

			System.out.println("There is no difference in the price.");

		}

		else {

			System.out.println("Buying single tickets is "
					+ twoDecimals.format(seasonTicket - (singleTicket * amountOfTrips)) + " euros cheaper.");

		}

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
