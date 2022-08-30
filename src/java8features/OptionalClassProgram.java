package java8features;

import java.util.Optional;

public class OptionalClassProgram {
	public static void main(String[] args) {
		String str[] = new String[10];
		Optional<String> obj = Optional.ofNullable(str[5]);
		if (obj.isPresent()) {
			String w = str[5].toUpperCase();
			System.out.println(w);
		} else {
			System.out.println("String is null");
		}

	}
}
