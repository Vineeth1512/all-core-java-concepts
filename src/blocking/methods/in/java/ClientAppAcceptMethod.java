package blocking.methods.in.java;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientAppAcceptMethod {
	public static void main(String[] args) throws UnknownHostException, IOException {

		int n, tmp;
		String str;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1", 1408);
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter any number");
		n = sc.nextInt();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(n);
		tmp = sc1.nextInt();
		System.out.println("Square of given number is: " + tmp);
	}

}
