package homework;

public class Prob3 {

	public static void main(String[] args) {
		oddEven(2);
		oddEven(3);

	}

	public static void oddEven(int number) {

		if (number % 2 == 0) {

			System.out.println(number + " is an EVEN number");

		} else {
			System.out.println(number + " is an ODD number");
		}

	}
}
