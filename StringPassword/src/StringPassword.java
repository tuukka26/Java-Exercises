import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (validatePassword(username, password) == true) {

			System.out.print("OK");
		} else {

			System.out.print("NOT OK");
		}
		input.close();
	}

	private static Boolean validatePassword(String user, String pwd) {

		if (pwd.length() < 8 || pwd.toLowerCase().contains(user.toLowerCase())) {

			return false;
		} else {

			return true;
		}

	}
}
