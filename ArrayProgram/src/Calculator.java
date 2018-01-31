
public class Calculator {

	public double avg(int[] array) {

		double average = 0;

		for (int i = 0; i < array.length; i++) {

			average += array[i];

		}

		average = average / array.length;

		return average;
	}

	public int max(int[] array) {

		int max = 0;
		
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {

				max = array[i];
			}

		}

		return max;
	}
}
