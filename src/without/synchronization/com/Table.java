package without.synchronization.com;

public class Table {
	 void printTable(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(n * i);
		}
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
