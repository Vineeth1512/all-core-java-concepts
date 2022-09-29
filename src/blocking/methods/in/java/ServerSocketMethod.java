package blocking.methods.in.java;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketMethod {
	public static void main(String[] args) throws IOException {
		System.out.println("From Starting..");
		int num, temp;
		String str;
		ServerSocket obj = new ServerSocket(1408);
		Socket ss = obj.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		str = ss.toString();
		num = sc.nextInt();
		temp = num * num;
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp);
		System.out.println("Server started....");
	}
}