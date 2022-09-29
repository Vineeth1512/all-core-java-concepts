package with.synchronization.com;

public class MyThreadOne extends Thread {
	Table t;

	public MyThreadOne(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}
