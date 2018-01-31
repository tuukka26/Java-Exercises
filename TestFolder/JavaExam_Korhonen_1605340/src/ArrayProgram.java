
public class ArrayProgram {

	public static void main(String[] args) {

		Calculator myCalculator = new Calculator();

		int[] a1 = { 1, 5, 3, 4 };
		int[] a2 = { 1, 2, 3, 10, 5, 6 };

		System.out.println(myCalculator.avg(a1));
		System.out.println(myCalculator.avg(a2));

		System.out.println(myCalculator.max(a1));
		System.out.println(myCalculator.max(a2));

	}

}
