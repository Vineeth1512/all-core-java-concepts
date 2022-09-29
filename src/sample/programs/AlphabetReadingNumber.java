package sample.programs;

;

public class AlphabetReadingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 6; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		int sum = 1;
		for (int i = 2; i <= 5; i++) {
			sum = sum * i;

		}
		System.out.println(sum);

	}

}
