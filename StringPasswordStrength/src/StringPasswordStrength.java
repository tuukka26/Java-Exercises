import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkStrength(password) == true) {

			System.out.print("OK");
		} else {

			System.out.print("Not strong enough!");
		}

		input.close();
	}

	private static Boolean checkStrength(String password) {

		Boolean hasUpper = false;
		Boolean hasLower = false;
		Boolean hasDigit = false;
		Boolean hasOther = false;

		if (password.length() < 8) {

			return false;
		}

		for (int i = 0; i < password.length(); i++) {

			if (Character.isUpperCase(password.charAt(i))) {

				hasUpper = true;

			} else if (Character.isLowerCase(password.charAt(i))) {

				hasLower = true;

			} else if (Character.isDigit(password.charAt(i))) {

				hasDigit = true;

			} else if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {

				hasOther = true;
			}
		}
		if ((hasUpper && hasLower && hasDigit) || (hasUpper && hasLower && hasOther) || (hasLower && hasDigit && hasOther)) {

			return true;

		} else {

			return false;
		}

	}
}
