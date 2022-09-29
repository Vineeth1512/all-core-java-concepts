package java8.features;

import java.util.ArrayList;

public class LambdaExpression {
	public static void main(String[] args) {
		Addition d = (a, b) -> System.out.println("Adding 2 numbers : " + (a + b));
		d.add(3, 7);
		Addition obj = (a,b)->System. out.println("Adding two numbers "+(a+b));
		Addition aa = (a,b)->System.out.println(">>>>aa<<<< "+(a+b));
		aa.add(21, 34);

		obj.add(12,32);

		ArrayList<Object> arr = new ArrayList<>();
		arr.add(2);
		arr.add("vinee");
		arr.add("");
		arr.add(null);
		arr.add("");
		arr.add(6);
		arr.add("kumar");
		arr.add("");
		arr.add(null);
		arr.forEach(n -> System.out.println(n));
		

	}
}
