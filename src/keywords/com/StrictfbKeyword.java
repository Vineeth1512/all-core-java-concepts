package keywords.com;

//Strictfp is a keyword in the java programming language that restricts floating point calculations to ensure portability. 
//The strictfp keyword can be applied on methods, classes and interfaces.
//strictfp cannot be used with abstract methods. However, it can be used with abstract classes/interfaces.
public class StrictfbKeyword {

	public strictfp double sum() {
		double a = 1e+10;
		double b = 7f +73;
		return a + b;
	}
	public static void main(String[] args) {
		StrictfbKeyword s = new StrictfbKeyword();
		System.out.println(s.sum());
	}
}
