package collections.com;

import java.util.Iterator;
import java.util.Stack;

public class StackPogram {
public static void main(String[] args) {
	Stack<Object> obj =new Stack<Object>();
	obj.push(1);		// it is the child class of VECTOR
	obj.push("vineeth");//It is specially designed class for LAST IN FIRST OUT order(LIFO)
	obj.pop();//
	obj.push(null);
	obj.push("kumar");
	obj.push(1);
	System.out.println(obj);
	Iterator<Object> itr=obj.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	for(Object a:obj) {
		System.out.println(a);
	}
}
}
