package sample.programs;
import java.util.Scanner;
public class DayName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		char n=scan.next().charAt(0);
		// TODO Auto-generated method stub
				switch(n) {
			
				
				case '1':{
					System.out.println(n+ " MONDAY");
					break;
				}case '2':{
					System.out.println(n+" TUESDAY");
					break;
				}case '3':{
					System.out.println(n+" WEDENSDAY");
					break;
				}case '4':{
					System.out.println(n+" THURSDAY");
					break;
				}case '5':{
					System.out.println(n+" FRIDAY");
					break;
				}case '6':{
					System.out.println(n+" SATURDAY");
					break;
				}case '7':{
					System.out.println(n+" SUNDAY");
					break;
				}
				default:{
					System.out.println(n+" A4J///'it is not name");
				}
				}
	}

}
