package sample.programs;
import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("enter the string");
String s=scan.next();

		switch(s) {
		case "jan":
		case "feb":{
			System.out.println("winter");
			break;
		}
		case "mar":
		
		case "apr":
		case "may":{
			System.out.println("summer");
			break;
			}
		case "jun":
		
		case "jul":
		case "aug":
		case "sep":
		case "oct":{
			System.out.println("rainy");
			break;
		}
		case "nov":
		case "dec":{
			System.out.println("winter");
			break;
		}
			
			
			default:{
				System.out.println("there is no season");
			}
			
			
		}


	}

}
