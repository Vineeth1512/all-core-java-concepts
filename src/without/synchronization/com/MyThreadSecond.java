package without.synchronization.com;

public class MyThreadSecond extends Thread {
	Table t;

	public MyThreadSecond(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
