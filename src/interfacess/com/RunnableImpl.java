package interfacess.com;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"Executing run() method...");
		
	}

}
