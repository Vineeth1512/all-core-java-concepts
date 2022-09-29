package sample.programs;
import java.util.Scanner; 
public class Spy {
	public static void spy(int num) {
		int rem,product=1,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(sum==product){
			System.out.println("The number is spy number");
		}
		else {
			System.out.println("The number is not spy number");
		}
		
		
	}

	
		
		
	

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		 System.out.println("enter the number");
		//int num=scan.nextInt();
		//System.out.println(spy(scan.nextInt()));
spy(123);
	}
}
