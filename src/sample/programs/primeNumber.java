package sample.programs;

//import java.util.Scanner;
class primeNumber {

	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			System.out.println(">>>i :<<< "+i);
			int count = 0;
			for (int j = 1; j < i; j++) {
				System.out.println(">>>j++ :<<< "+j);

				if (i % j == 0) {
					//stem.out.println(">>>i :<<< "+i);
				//System.out.println(">>>j :<<< "+j);

					count++;
				}
			}
			System.out.println(">>>count :<<< "+count);

			if (count == 1) {
				System.out.println(i);
			}
		} 
		
		
		
		
		
		
		
		
		
		
		
	}
}