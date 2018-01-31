import java.util.Scanner;

public class EnglishWordProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an English word: ");
		String userInput = input.nextLine();

		if (userInput.equals("")) {

			System.out.println("\nNo word given.");

		} else if (userInput.matches("[a-zA-z]{1,44}")) {

			System.out.println("\n'" + userInput + "' might be an English word.");

		} else {

			System.out.println("\n'" + userInput + "' is not an English word.");

		}

		input.close();
	}

}
