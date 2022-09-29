package without.synchronization.com;

public class TestSynchronization {
	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();
		MyThreadOne obj = new MyThreadOne(table);
		MyThreadSecond obje = new MyThreadSecond(table);
		obj.start();
		obje.start();
	}

}
