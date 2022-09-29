package arrayPrograms;

public class LargestAndSmallestArray {
	public static void main(String[] args) {
		int a[] = { 3, 6, 7, 9, 8, 66 };
		int k = 2;
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == k) {
				System.out.println(a[i]);
				break;
			}
		//	System.out.println(a[i]);

		}

	}
}