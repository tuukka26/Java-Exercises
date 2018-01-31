import java.util.Scanner;

public class ObjectsElection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int numCandidates = Integer.parseInt(input.nextLine());

		Candidate[] candidates = new Candidate[numCandidates];

			for (int i = 0; i < candidates.length; i++) {

				System.out.print("Enter " + (i + 1) + ". name: \n");
				String name = input.nextLine();
				
				System.out.print("Enter votes: ");
				int votes = Integer.parseInt(input.nextLine());
				
				candidates[i] = new Candidate(name, votes); 

			}
		

			for (Candidate candidateObject : candidates) {
				
				System.out.println(candidateObject.getName() + " " + candidateObject.getVotes());
			}
	}

}
