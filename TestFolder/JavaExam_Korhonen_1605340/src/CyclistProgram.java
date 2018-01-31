import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class CyclistProgram {

	public static void main(String[] args) {

		ArrayList<Cyclist> cyclistList = new ArrayList<Cyclist>();

		DecimalFormat noDecimals = new DecimalFormat("0");
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);

		System.out.println("=== Enter cyclist info (empty name ends) === \n");

		System.out.print("Enter name: ");
		String name = input.nextLine();

		while (!name.equals("")) {

			System.out.print("Enter weight(kg): ");
			double weight = Integer.parseInt(input.nextLine());

			System.out.print("Enter climbing power(W): ");
			double climbingPower = Integer.parseInt(input.nextLine());

			cyclistList.add(new Cyclist(name, weight, climbingPower));

			System.out.print("\nEnter name: ");
			name = input.nextLine();
		}

		System.out.println("\n === Cyclists ===");

		for (Cyclist cyclistObject : cyclistList) {

			System.out.println(cyclistObject.getName() + ": " + noDecimals.format(cyclistObject.getWeight()) + "kg, "
					+ noDecimals.format(cyclistObject.getClimbingPower()) + "W ("
					+ twoDecimals.format(
							cyclistObject.getWattsPerKilo(cyclistObject.getWeight(), cyclistObject.getClimbingPower()))
					+ " W/kg)");
		}

		//System.out.println("\n === Fittest climber(s) === \n");
		
		input.close();
	}

}
