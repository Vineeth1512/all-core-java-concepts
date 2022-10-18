package sample.programs;

public class DuplicatesBetweenTwoArrays {
	public static void main(String[] args) {
		int a[] = { 1, 3, 6, 5, 43, 7 };
		int b[] = { 1, 2, 89, 7, 8, 9, 67 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
		/*
		 * for (int i = 0; i < 100; i++) { if (i % 2 == 0) { System.out.println(i); } }
		 */
	}

}
