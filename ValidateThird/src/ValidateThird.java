import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String accepted = "";

		while (accepted != "OK") {

			System.out.print("Enter grade (0-5): ");
			String userInput = input.nextLine();

			try {

				int grade = Integer.parseInt(userInput);

				if (grade >= 0 && grade <= 5) {

					accepted = "OK";
					System.out.println(accepted);

				}

				else {

					System.out.println(grade + " is not a valid grade.");
					System.out.println("");

				}
			} catch (NumberFormatException nfe) {

				System.out.println(userInput + " is not a valid grade.");
				System.out.println("");

			}
		}
		input.close();
	}
}
