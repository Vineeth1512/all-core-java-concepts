package sample.programs;

//import java.util.Scanner;
public class Capitilize {
	int sid;

	String name;
	long phno;

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Capitilize(int sid, String name) { this.sid=sid; this.name=name; }
	 * Capitilize(int sid, String name,long phno) { this(sid,name); this.phno=phno;
	 * }
	 * 
	 * public void dip() { System.out.println(sid); System.out.println(name);
	 * System.out.println(phno); }
	 */

	public static void main(String[] args) {
		/*
		 * Scanner scan= new Scanner (System.in);
		 * System.out.println("enter the String"); String s=scan.nextLine();
		 * System.out.println(s.toUpperCase());
		 * 
		 * 
		 * // TODO Auto-generated method stub
		 * 
		 */
		/*
		 * Capitilize c =new Capitilize(111,"vinee"); c.dip(); Capitilize c1 =new
		 * Capitilize(111,"vineeth",9989582989l); c1.dip();
		 */

		Capitilize c = new Capitilize();

		c.setName("vineeth");
		System.out.println(c.getName());

	}

}