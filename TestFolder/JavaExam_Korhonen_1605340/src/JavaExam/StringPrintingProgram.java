import java.util.Scanner;

public class StringPrintingProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String userInput = input.nextLine();

		if (userInput.equals("")) {

			System.out.println("\nNo input given");

		} else {

			int startIndex = 0;
			int endIndex = 1;
			for (int i = 0; i < userInput.length(); i++) {

				System.out.println(userInput.substring(startIndex, endIndex));

				endIndex++;
			}
		}

		input.close();
	}

}
