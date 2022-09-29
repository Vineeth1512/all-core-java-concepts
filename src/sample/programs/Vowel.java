package sample.programs;
import java.util.Scanner;
public class Vowel {
//WAP to check the given character is vowel or not using switch
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character");
		// TODO Auto-generated method stub
			char ch=scan.next().charAt(0);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
				
			case 'O':
			case 'U':
		
		
			{
			
			System.out.println(ch+" is vowel character");
			break;
			}
			
				default: {
					System.out.println(ch+" is not vowel");
				}
			}
	}

}
