import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		int multiplier = 1;

		try {

			int number = Integer.parseInt(input.nextLine());

			if (number >= 0) {

				for (int i = 1; i <= number; i++) {
					multiplier = multiplier * i;

				}
				System.out.print(number + "! = " + multiplier);
			}

			else {
				System.out.println("Please enter a non-negative integer.");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");

		}
		input.close();
	}

}
