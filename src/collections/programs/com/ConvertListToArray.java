package collections.programs.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConvertListToArray {
	public static void main(String[] args) {
		List<String> obj = Arrays.asList("apple", "banana", "mango", "pear");
		System.out.println(obj);
		String str[] = new String[obj.size()];

		for (int i = 0; i < obj.size(); i++) {
			str[i] = obj.get(i);
		}

		for (String s : str) {
			System.out.println(s);
		}

		// ArrayList to String array conversion using toArray()
		String[] fruits = obj.toArray(new String[obj.size()]);
		for(String s1 :fruits) {
			System.out.println(" using toArray():  " +s1);
		}
		
		
		// Convert Array to list
		
		int[] a = {3,6,5,7,5,4,3,};
		ArrayList<Integer>  list = new ArrayList<Integer>();
		for(int i =0 ; i<a.length ; i++) {
			list.add(a[i]);
		}
		for(Integer i : list) {
			System.out.println(">>>> i <<<< "+ i);
		}
		
	}

}
