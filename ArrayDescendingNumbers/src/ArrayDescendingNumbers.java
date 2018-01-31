import java.util.Scanner;
import java.util.Arrays;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double[] numbersArray = new double[4];
		
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print("Enter " + (i+1) + ". number: ");
			numbersArray[i] = readDouble(input);
			}
		
		Arrays.sort(numbersArray);

		
		for (int j = numbersArray.length - 1; j >= 0; j--) {
			System.out.print(numbersArray[j] + " ");
			}
		
		input.close();
		
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
