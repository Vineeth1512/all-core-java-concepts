package sample.programs;

import java.util.Scanner;

public class FirstLetterBig {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		s = "" + s;
		String str = " ";
		/*
		 * str=(s.charAt(0)+"").toUpperCase();
		 * 
		 * for(int i=1;i<s.length();i++) { str=str+(s.charAt(i)+"").toLowerCase(); }
		 */

		/*
		 * Scanner sc=new Scanner(s); while(sc.hasNext()) { String word=sc.next();
		 * str+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" "; }
		 */

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				str = str + ch;
				i++;
				ch = s.charAt(i);
				str = str + Character.toUpperCase(ch);
			} else {
				str = str + ch;
			}
		}

		System.out.println(str.trim());
	}

}
