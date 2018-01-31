import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String firstString = input.nextLine();

		System.out.print("Enter second string: ");
		String secondString = input.nextLine();

		if (isAnagram(firstString, secondString)) {

			System.out.println("Anagram!");
		} else {

			System.out.println("No anagram.");
		}

		input.close();

	}

	private static boolean isAnagram(String firstString, String secondString) {

		if (firstString.isEmpty() || secondString.isEmpty() || !firstString.matches(".*[a-zåäöA-ZÅÄÖ]+.*")
				|| !secondString.matches(".*[a-zåäöA-ZÅÄÖ]+.*")) {

			return false;
		}

		char[] firstArray = firstString.toLowerCase().replaceAll("[, ; . \\s+]", "").toCharArray();
		char[] secondArray = secondString.toLowerCase().replaceAll("[, ; . \\s+]", "").toCharArray();

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		if (!Arrays.equals(firstArray, secondArray)) {

			return false;
		}

		return true;
	}

}


