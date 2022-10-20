package abstraction.com;

public class ReserveBankOfIndia {
	public static void main(String[] args) {

		HDFC hdfc = new HDFC();
		hdfc.loan();
		hdfc.credit();
		hdfc.debit();
		hdfc.intrest();

		Bank b = new HDFC();
		b.debit();
		b.credit();
		b.loan();
		// b.intrest();
		// Bank bb = new Bank();
	}

}