import java.util.Scanner;
import java.util.regex.Pattern;

public class StringDecimalPartLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		String userInput = input.nextLine();

		String decimal = "([0-9]+)[.,]([0-9]+)";
		boolean isDecimal = Pattern.matches(decimal, userInput);

		if (isDecimal == false) {

			System.out.println("Please enter a proper decimal number");

		} else {

			String finalDecimal = userInput.replace(',', '.');

			int integers = finalDecimal.indexOf('.');
			int decimals = finalDecimal.length() - integers - 1;

			System.out.println(decimals + " decimal place(s)");
		}

		input.close();
	}

}
