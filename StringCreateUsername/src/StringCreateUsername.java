import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter surname: ");
		String lastName = input.nextLine();

		if (createUsername(firstName, lastName) == null) {

			System.out.println("Not enough letters to create a username!");
		} else {

			System.out.println(createUsername(firstName, lastName));

		}

		input.close();
	}

	private static String createUsername(String first, String last) {

		String username = "";

		if (first.length() < 2 || last.length() < 3) {
			return null;

		} else {

			for (int i = 0; i < 3; i++) {

				username = username + last.toLowerCase().charAt(i);

			}

			for (int i = 0; i < 2; i++) {

				username = username + first.toLowerCase().charAt(i);

			}
			return username;
		}
	}
}
