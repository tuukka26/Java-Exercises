import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayBloodTypes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		String[] bloodTypes = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.print("Enter blood type: ");
		String userInput = input.nextLine();
		double count = 0;

		for (int i = 0; i < bloodTypes.length; i++) {

			if (userInput.equals(bloodTypes[i])) {

				count++;

			}

		}
		
		double sum = count / bloodTypes.length * 100;

		System.out.print(oneDecimal.format(sum) + " %");

		input.close();

	}

}
