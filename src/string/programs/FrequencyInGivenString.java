package string.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyInGivenString {
	public static void main(String[] args) {
		String s = "vinEethhvii";
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int count = s.charAt(i);
			if (count >= 65 && count <= 90) {
				a[count - 65]++;
			} else if (count >= 97 && count <= 122) {
				a[count - 97]++;

			}
		}
		for (int i = 0; i < 26; i++) {
			if (a[i] > 0) {
				System.out.println((char) (i + 65) + "  " + a[i]);
			}
		}
		Map<String, Long> l = Arrays.stream(s.toLowerCase().split(""))
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(l);

		Stream.of(s.toLowerCase().split(""))
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.map(e -> e.getKey() + e.getValue() + " ").forEach(System.out::print);

	}
}
