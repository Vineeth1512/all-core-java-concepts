package abstraction.com;

public class ReserveBankOfIndia {
	public static void main(String[] args) {
		Bank b = new Citi();
		Bank b1 = new HDFC();
		System.out.println(b.getIntrestRatde());
		System.out.println(b1.getIntrestRatde());
	}
}