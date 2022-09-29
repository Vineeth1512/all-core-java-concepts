package sample.programs;

public class largestUsingif {
//WAP TO find largest value using if else
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 6;
		int c = 1;
		if (a > b && a > c) {
			System.out.println(a + "is largest number");
		} else if (b > c) {
			System.out.println(b + " is largest number");
		} else {
			System.out.println(c + " is largest number");
		}

	}

}
