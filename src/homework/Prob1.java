package homework;

public class Prob1 {

	public static void main(String[] args) {
		calculate(20.5, 10, '-');
		calculate(20.5, 10, '+');
		calculate(20.5, 10, '/');
		calculate(20.5, 10, '*');
		calculate(20.5, 10, '%');
		calculate(20.5, 10, '^');
	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {

		if (mathOperationSign == '+') {

			double result = numOne + numTwo;

			System.out.println(numOne + " + " + numTwo + " = " + result);

		} else if (mathOperationSign == '-') {

			double result = numOne - numTwo;

			System.out.println(numOne + " - " + numTwo + " = " + result);

		} else if (mathOperationSign == '/') {

			double result = numOne / numTwo;

			System.out.println(numOne + " / " + numTwo + " = " + result);

		} else if (mathOperationSign == '*') {

			double result = numOne * numTwo;

			System.out.println(numOne + " * " + numTwo + " = " + result);

		} else if (mathOperationSign == '%') {

			double result = numOne % numTwo;

			System.out.println(numOne + " % " + numTwo + " = " + result);

		} else {
			System.out.println("Error");
		}
	}
}
