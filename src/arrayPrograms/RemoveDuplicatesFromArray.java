package arrayPrograms;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 7, 3, 6, 2, 1 };
		// String a[] = { "java", "java", "sql", "core", "sql" };
		int n = a.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					// System.out.print(" " + a[i]);// only duplicates 1346
					sum = sum + a[i];

					a[j] = a[n - 1];
					n--;
				}
			}
			System.out.print(" " + a[i]);//

		}
		System.out.println("  sum the duplacates " + sum);

	}
}
