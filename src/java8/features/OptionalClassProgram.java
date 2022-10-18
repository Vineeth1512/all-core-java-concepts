package java8.features;

import java.util.Optional;

public class OptionalClassProgram {
	public static void main(String[] args) {
		//String str[] = new String[10];

		String s = "vineeth";
		Optional<String> obj = Optional.ofNullable(s);
		if (obj.isPresent()) {
			// String w = str[5].toUpperCase();
			System.out.println("value is " + s);
		} else {
			String value =obj.orElse("default");
			System.out.println("value is not present "+value );
		}

	}
}
