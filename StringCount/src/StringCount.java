import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int count = 0;
		
		System.out.print("Enter first string: ");
		String aString = input.nextLine();

		if (aString.isEmpty()) {

			System.out.println("No Strings inputted.");

		} else {

			do {
				count++;
				System.out.print("Enter a string: ");
				aString = input.nextLine();

			} while (aString.length() != 0);

			System.out.println("");
			System.out.println(count + " strings");
		}

		input.close();
	}
}
