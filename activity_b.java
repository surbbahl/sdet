package Activity_3b;

import java.util.Deque;
import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.LinkedList;

public class activity_b {
	public static void main(String args[])
	{
		Deque<String> q1=new LinkedList<String>();
		q1.add("Dog");
		q1.add("Cat");
		q1.add("Cow");
		q1.add("Mouse");
		q1.add("Lion");
		q1.add("Tiger");
		Iterator<String> it1=q1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		q1.remove("Dog");
		System.out.println(q1.getFirst());
		System.out.println(q1.peek());
		
	}
}
