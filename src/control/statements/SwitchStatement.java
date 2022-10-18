package control.statements;

public class SwitchStatement {
	public static void main(String[] args) {
		int day = 3;
		String dayString;
		switch (day) {
		case 0:
			dayString = "Monday";
			break;

		case 1:
			dayString = "Tuesday";
			break;

		case 2:
			dayString = "Wednesday";
			break;

		case 3:
			dayString = "Thursday";
			break;


		case 4:
			dayString = "Friday";
			break;

		case 5:
			dayString = "Saturday";
			break;

		case 6:
			dayString = "Sunday";
			break;
		default:
			dayString = "invalid ";

		}
		System.out.println(dayString);
	}

}
