package sample.programs;
import java.util.Scanner;
public class factorial {
	public static int fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(fact(scan.nextInt()));
		
	
			//fact =fact*1;
			//fact=fact*2;
	}
		// TODO Auto-generated method stub
		
	

}
