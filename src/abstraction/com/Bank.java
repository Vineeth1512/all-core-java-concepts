package abstraction.com;

public abstract class Bank {
	public abstract void loan();

	public void credit() {
		System.out.println("Credit to bank.");
	}

	public void debit() {
		System.out.println("Debited from bank.");
	}

}
