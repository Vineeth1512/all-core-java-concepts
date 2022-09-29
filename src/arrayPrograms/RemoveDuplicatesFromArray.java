package arrayPrograms;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {

		int a[] = { 1,2, 1, 2, 3};
		// String a[] = { "java", "java", "sql", "core", "sql" };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (a[i] == a[j]) {
					// System.out.print(" " + a[i]);// only duplicates 1346

					a[j] = a[n - 1];
					n--;
				}
			}
			System.out.print(" " + a[i]);//
		}
	}
}
