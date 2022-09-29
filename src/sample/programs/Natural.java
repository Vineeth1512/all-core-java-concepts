package sample.programs;

//import java.util.Scanner;
public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scan=new Scanner(System.in);
//System.out.println("enter the number");
//int n=scan.nextInt();
//char ch=scan.next().charAt(0);
		// wap to print 1 to 10 natural numbers

		/*
		 * while(i<10) { System.out.println(i++);
		 * 
		 * }
		 */

		/*
		 * do { System.out.println(i++); } while(i<10);
		 * 
		 */

		/*
		 * for(int i=1;i<=10;i++) { System.out.println(i); }
		 */

		/*
		 * for(int i=1;i<=n;i++) { System.out.println(i); }
		 */

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println(" ");

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " " + (char) (ch + 33));
		}
		System.out.println(" ");

		for (char ch = 'z'; ch >= 'a'; ch--) {
			System.out.print((int) ch + " ");
		}
	}

}
