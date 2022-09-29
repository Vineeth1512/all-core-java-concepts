package sample.programs;
//import java.util.Scanner;
public class strongNumber {

	

	public static void main(String[] args) {
	int num=145;
	int rem,sum=0;
	int n=num;
	while(num>0) {
		rem=num%10;
		sum=sum+fact(rem);
		num=num/10;
		System.out.println(sum);
	}
	
	}
	
		

	
public static int fact(int num) {
	int fact=1;
	for(int i=1;i<num;i++) {
		fact =fact*i;
	}
	return fact;
}

	}