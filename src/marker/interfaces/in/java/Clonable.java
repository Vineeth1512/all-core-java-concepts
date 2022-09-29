package marker.interfaces.in.java;

//Marker interface can be defined as interface having no DATA MEMBERS and MEMBER FUNCTIONS.
//Examples of Marker Interface are SERIALIZABLE,CLONEABLE & REMOTE interfaces.
public class Clonable implements Cloneable {
	// Cloneable interface is a marker interface it is used to create an exact copy
	// of the OBJECT.
	// If we want to create copy of the class OBJECT.The clone() method of the
	// OBJECT class used to create the copy of the OBJECT
	int i;
	String s;

	public Clonable(int i, String s) {
		this.i = i;
		this.s = s;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
