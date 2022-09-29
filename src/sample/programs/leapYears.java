package sample.programs;

//import java.util.Scanner;
public class leapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan =new Scanner(System.in);
		 * System.out.println("enter the start year"); int a =scan.nextInt();
		 * System.out.println("enter the end   year"); int b=scan.nextInt(); for(int
		 * i=a;i<=b;i++) { if((i%4==0)&&(i%100!=0)||(i%400==0)) { System.out.println(i);
		 * } }
		 */
		int i = 2001;
		if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("Not Leap yeat");
		}

	}

}
