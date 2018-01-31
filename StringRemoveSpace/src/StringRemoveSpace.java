import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String userInput = input.nextLine();
		
		System.out.println('"' + removeExtraSpace(userInput) + '"');
		
		input.close();
		
	}

	private static String removeExtraSpace(String userInput) {
		
		String trimmed = userInput.replaceAll("\\s+"," ").trim();
		return trimmed;
	}
}
