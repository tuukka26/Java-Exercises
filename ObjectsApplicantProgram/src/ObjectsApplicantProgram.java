import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Applicant[] applicantArray = new Applicant[4];

		for (int i = 0; i < applicantArray.length; i++) {

			System.out.print("Enter " + (i + 1) + ". name: ");
			String name = input.nextLine();
			System.out.print("Enter points: ");
			int points = Integer.parseInt(input.nextLine());
			applicantArray[i] = new Applicant(name, points);

		}

		System.out.println("");
		System.out.print("Enter the minimum of required points: ");
		int minimumPoints = input.nextInt();
		System.out.println("");
		
		System.out.println("The following applicants achived the minimum of " + minimumPoints + " points: ");
		for (int i = 0; i < applicantArray.length; i++) {
			
			if (applicantArray[i].getPoints() >= minimumPoints) {
				
				System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints() + " points");
			}
		}

		input.close();
	}

}


