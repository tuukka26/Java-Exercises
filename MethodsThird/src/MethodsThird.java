import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThird {

	public static void main(String[] args) {
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter gross salary: ");
		double grossSalary = readDouble(input);

		System.out.print("Enter income tax rate: ");
		double incomeTax = readDouble(input);
		
		double sum = calculateNetSalary(grossSalary, incomeTax);
		
		System.out.println("");
		System.out.println("The net salary is " + twoDecimals.format(sum));
		
		input.close();
		
	}

	private static double calculateNetSalary(double salary, double tax) {
		return (1 - (tax / 100)) * salary;
		}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}

