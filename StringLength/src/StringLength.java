import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int length = 0;

		System.out.print("Enter first string: ");
		String aString = input.nextLine();

		if (aString.equals("quit")) {

			System.out.println("The total length is " + length);

		} else {

			do {
				length += aString.length();
				System.out.print("Enter a string: ");
				aString = input.nextLine();

			} while (!"quit".equals(aString));

			System.out.println("");
			System.out.println("The total length is " + length);

		}

		input.close();
	}

}
