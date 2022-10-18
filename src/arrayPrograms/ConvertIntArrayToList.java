package arrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntArrayToList {
	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 3, 4, 4, 5, 6, 7, 76, 4, 3 };
		for (int i : a) {
			System.out.println(i);
		}
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(list);
	}

}
