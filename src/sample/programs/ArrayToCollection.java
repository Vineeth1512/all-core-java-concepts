package sample.programs;

import java.util.*;

//wap to convert array to collection
public class ArrayToCollection {

	public static void main(String[] args) {
		String playersArray[] = { "vineeth", "virat", "manoj", "suresh" };
		System.out.println("Array input:" + Arrays.toString(playersArray));
		List<String> playersList = Arrays.asList(playersArray);

		System.out.println("converted elements:" + playersList);
	}

}
