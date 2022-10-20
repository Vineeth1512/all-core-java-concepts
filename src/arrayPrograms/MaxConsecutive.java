package arrayPrograms;

public class MaxConsecutive {

	public static void main(String[] args) {
		int a[] = {1, 1, 0, 0, 1, 1, 1, 0, 0,0,  1, 1, 1, 1 };
		int count = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			while (i < a.length && a[i] == 1) {
				count++;
				i++;
			}
			if (max < count) {
				max = count;
			}
			count = 0;

		}
		System.out.println(max);
	}

}
