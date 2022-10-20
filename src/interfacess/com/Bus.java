package interfacess.com;

public interface Bus {
	public void start();

	public void stop();

	public void refuel();
	
	default void gear() {
		System.out.println("From Gear method of Bus interface");
	}

}
