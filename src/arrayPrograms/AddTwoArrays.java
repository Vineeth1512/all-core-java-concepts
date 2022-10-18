package arrayPrograms;

public class AddTwoArrays {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6, 4, 2 };
		System.out.println();
		int b[] = { 9, 8, 6, 7, 2, 3, 1, 6 };
		int length = a.length < b.length ? a.length : b.length;
		System.out.println(length + " >>>>>><<<<<<<<<<");
		int c[] = new int[length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
			// System.out.println(a[i]+b[j]);

			System.out.print(" " + c[i]);

		}

	}

}
 