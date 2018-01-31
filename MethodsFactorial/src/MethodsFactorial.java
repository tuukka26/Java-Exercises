
public class MethodsFactorial {

	public static void main(String[] args) {

		int number = 1;
		for (int i = 1; i <= 9; i++) {

			number = +i;
			System.out.println(i + "! = " + factorial(number));
		}

	}

	private static int factorial(int input) {

		for (int j = (input - 1); j > 1; j--) {

			input = input * j;

		}

		return input;

	}
}
