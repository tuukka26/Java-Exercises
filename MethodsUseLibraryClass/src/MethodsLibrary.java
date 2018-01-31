
public class MethodsLibrary {

	public static int factorial(int input) {

		if (input == 0) {
			
			return 1;
			
		} else {
		for (int j = (input - 1); j > 1; j--) {

			input = input * j;

		}

		return input;
		}
	}
}
