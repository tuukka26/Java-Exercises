
public class MethodsPrimes {

	public static void main(String[] args) {

		int number = 2;

		for (int i = 1; i <= 70; i++) {

			if (isPrime(number)) {

				System.out.print(number + " ");

			}

			number++;
		}
	}

	public static boolean isPrime(int input) {

		for (int i = 2; i < input; i++) {
			
			if (input % i == 0)
				
				return false;
		}
		return true;
	}

}
