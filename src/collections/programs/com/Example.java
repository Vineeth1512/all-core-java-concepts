package collections.programs.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		// Create Array and convert list
		Character ch[] = { 'a', 'f', 'd', 'y', 'u' };
		System.out.println(ch);
		List<Character> list = Arrays.asList(ch);
		System.out.println(list);

		String s = "my name is vineeth I is ";
		String str[] = s.split(" ");
		Set<String> setObj = new HashSet<>();

		for (int i = 0; i < str.length; i++) {
			for (int j = 1; j < str.length; j++) {
				if (str[i].equals(str[j]) && i != j) {
					setObj.add(str[i]);
				}
			}
		}
		System.out.println(setObj);
		//Using java 8 streams 
		
		List<String> listObj = Arrays.asList(str);
		Set<String> ab = listObj.stream()
				.filter(n -> Collections.frequency(listObj, n) > 1)
				.collect(Collectors.toSet());
		System.out.println(ab);
	}

}
