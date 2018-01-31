import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageOfDecimalValues {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);

		double sum = 0;
		int count = 0;
		
		
		System.out.print("Enter first number (zero ends): ");
		double enteredNum = readDouble(input);

		if (enteredNum == 0) {
			
			System.out.println("Nothing to calculate");
		} else {
			
			sum += enteredNum;
			do {
				System.out.print("Enter next number (zero ends): ");
				enteredNum = readDouble(input);
				sum += enteredNum;
				count++;
				
			}while (enteredNum != 0); 
		
			System.out.println("The average is " + twoDecimals.format(sum / count));
			}
			
		}
		

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
