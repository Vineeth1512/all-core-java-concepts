package composition.com;

public class AutoDriverMain {
	public static void main(String[] args) {
		Auto obj = new Auto("Suziki", 3, new Engine(34.76));
		obj.engine.Combution();
		obj.drive();
	}

}
