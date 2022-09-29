package java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface StreamExamples {
	public static void main(String[] args) {
		// Counting Empty String...
		List<String> listStr = Arrays.asList("vineeth", "", "kumar", "ajay", "", "manoj", "");
		long count = listStr.stream().filter(x -> x.isEmpty()).count();
		System.out.println("number of empty numbers..:" + count);

// Find null values in String
		List<String> nullValues = Arrays.asList("vineeth", null, "kumar", "ajay", "manoj", null, null);
		long nullValue = nullValues.stream().filter(x -> x == null).count();
		System.out.println("number of nullValues numbers..:" + nullValue);

// Starts with A letters count :
		long num = listStr.stream().filter(x -> x.startsWith("a")).count();
		System.out.println("Starts with A letters count : " + num);

		List<String> filtered = listStr.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("List of the string elements" + filtered);

		List<String> filter = listStr.stream().filter(x -> x.length() > 6).collect(Collectors.toList());
		System.out.println("More than Two elements as a list : " + filter);

// Convert String to uppercase and Join them with coma :
		List<String> list = Arrays.asList("sql", "java", "spring", "mvc", "aws");
		List<String> g = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println("Convert String to uppercase and Join them with coma : " + g);

// Sorting Array..
		int a[] = { 22, 6, 5, 88, 55, 3, 56, 65 };
		a = Arrays.stream(a).sorted().toArray();
		System.out.println(Arrays.toString(a));
//Print Odd numbers using java8
		List<Integer> l = Arrays.asList(22, 6, 5, 88, 55, 3, 56, 65);
		System.out.println(l);
		List<Integer> lg = l.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println(lg);

		List<String> string = Arrays.asList("hyderabad", "mumbai", "pune", "patna", "benguluru");
		List<String> listString = string.stream().toList();
		List<String> listStartWith = string.stream().collect(Collectors.toList());
		System.out.println("Using collect method to list : " + listStartWith); // output same.
		System.out.println("With out using collect method to list   : " + listString);

	}

}
