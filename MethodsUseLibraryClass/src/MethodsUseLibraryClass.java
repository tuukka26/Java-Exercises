import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int newNumber = Integer.parseInt(input.nextLine());
		
		MethodsLibrary.factorial(newNumber);
		
		System.out.println(newNumber + "! = " + MethodsLibrary.factorial(newNumber));
		
		input.close();
	}
	
}
