package with.synchronization.com;

public class TestSynchronization {
	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();
		MyThreadOne obj = new MyThreadOne(table);
		MyThreadSecond obje = new MyThreadSecond(table);
		obj.start();
		obj.join();
		System.out.println("First Thread Name : " + obj.getName());
		System.out.println("Second Thread Name : " + obje.getName());
		System.out.println("First Thread Id : " + obj.getId());
		System.out.println("Second Thread Id : " + obje.getId());
		System.out.println("Current Thread  : " + obj.currentThread());

		obje.start();
		
	}

}
