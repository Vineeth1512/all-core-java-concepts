package arrayPrograms;

public class FinalizeMethod {
	public void finalize() {
		System.out.println("From finalize method..  : ");
	}

	public static void main(String[] args) {
		FinalizeMethod f1 = new FinalizeMethod();
		FinalizeMethod f2 = new FinalizeMethod();
		f1.finalize();
		//f2.finalize();
		//f1 = null;
		f2 = null;
		System.out.println("Clean up processing is performed..");
		System.out.println(f1);
		System.gc();

	}

}
