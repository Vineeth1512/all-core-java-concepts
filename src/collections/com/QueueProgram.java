package collections.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {
	public static void main(String[] args) {
		Queue<Object> obj = new LinkedList<>();
		obj.add(1);
		obj.add("vineeth");
		obj.add(null);
		obj.add(null);
		obj.add(1);

		System.out.println(obj);
		Iterator<Object> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		Queue<Object> que=new PriorityQueue<>();
		que.add(1);
		que.add(6);	//it allows DUPLICATES 
		//que.add("vineeth");
		//que.add("kumar");
		//que.add("mudham");
		que.add(9);
		que.add(67);
		que.add(1);
		System.out.println("Queueeeeeeeeeeeeee");
		System.out.println(que);
		Iterator<Object> it=que.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());	
		}

		

	}

}
