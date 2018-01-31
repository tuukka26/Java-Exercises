import java.util.Scanner;

public class GreetMe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstname = input.nextLine();

		System.out.println();
		System.out.println("Hello, " + firstname + "!");

		input.close();
	}

}
