import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter your hourly wage: ");
		double hourlyWage = readDouble(input);

		System.out.print("Enter the number of days: ");
		int numDays = input.nextInt();

		int[] workDays = new int[numDays];
		int totalHours = 0;
		int overTime = 0;

		for (int i = 0; i < workDays.length; i++) {

			System.out.print("Hours worked on day " + (i + 1) + ": ");
			workDays[i] = input.nextInt();
			
			if (workDays[i] > 8) {
				
				overTime += (workDays[i] - 8);
				
			}

		}

		System.out.println("");

		for (int j = 0; j < workDays.length; j++) {

			totalHours += workDays[j];

		}

		System.out.println("Total work hours is " + totalHours);
		System.out.println("Gross pay is " + twoDecimals.format(((totalHours - overTime) * hourlyWage + overTime * (hourlyWage * 1.5))));
		System.out.print("You entered the following daily hours: ");
		
		for (int k = 0; k < workDays.length; k++) {
			
			System.out.print(workDays[k] + " ");
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
