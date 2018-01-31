import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int numCandidates = Integer.parseInt(input.nextLine());

		int[] candidates = new int[numCandidates];
		String[] candidateNames = new String[numCandidates];
		int[] votes = new int[numCandidates];

		for (int i = 0; i < candidates.length; i++) {

			System.out.print("Enter " + (i + 1) + ". name: ");
			candidateNames[i] = input.nextLine();

			System.out.print("Enter votes: ");
			votes[i] = Integer.parseInt(input.nextLine());

		}

		System.out.println("");

		int mostVotes = votes[0];

		for (int i = 0; i < votes.length; i++) {

			if (votes[i] > mostVotes) {

				mostVotes = votes[i];

			}

		}

		boolean isTie = false;

		for (int i = 0; i < votes.length; i++) {

			for (int j = i + 1; j < votes.length; j++) {

				if (votes[i] == votes[j] && votes[i] == mostVotes) {

					isTie = true;
					System.out.println("The election is a tie between the following candidates:");
					System.out.println(candidateNames[i] + " (" + votes[i] + " votes)");
					System.out.println(candidateNames[j] + " (" + votes[j] + " votes)");

				}

			}

		}
		if (!isTie) {

			for (int i = 0; i < votes.length; i++) {

				if (votes[i] == mostVotes) {

					System.out.println("The winner is " + candidateNames[i] + " with " + votes[i] + " votes!");

				}
			}

		}

		input.close();
	}

}
