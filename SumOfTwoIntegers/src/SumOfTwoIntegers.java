import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstNumber = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int secondNumber = Integer.parseInt(input.nextLine());

		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

		input.close();
	}

}
