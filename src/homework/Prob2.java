package homework;

public class Prob2 {

	public static void main(String[] args) {
		getGender('m');
		getGender('f');
		getGender('M');
		getGender('F');
	}

	public static void getGender(char gender) {

		switch (gender) {

		case 'm':
		case 'M':
			System.out.println("Male");
			break;
			
		case 'f':
		case 'F':
			System.out.println("Female");

		}
	}
}
