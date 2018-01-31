import java.util.Scanner;

public class AgeAndName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = Integer.parseInt(input.nextLine());

		System.out.print("Enter your first name: ");
		String name = input.nextLine();

		System.out.println();
		System.out.println(name + ", " + age + " years");

		input.close();
	}
}
