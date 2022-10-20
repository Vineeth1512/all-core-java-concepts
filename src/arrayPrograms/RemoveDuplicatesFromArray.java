package arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	static int reMoveDuplate(int[] arr) {
		Arrays.sort(arr);
		
		for(int abc :arr) {
		//	System.out.println(abc);
		}
		if (arr.length == 0)
			return 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}

		return j + 1;

	}

	public static void main(String[] args) {

		int[] a = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
		System.out.println(reMoveDuplate(a));

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
