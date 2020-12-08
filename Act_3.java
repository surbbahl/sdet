package Activity_3_A;

import java.util.LinkedList;
import java.util.Queue;

public class Act_3 {
	public static void main( String args[])
	{
	Queue<Integer> q =new LinkedList<>();
	
	for (int i =1; i<=5;i++)
	{
		q.add(i);
	}
	System.out.println(q);
	int remove_number=q.remove();
	System.out.println(remove_number);
	System.out.println(q.peek());
	System.out.println(q.size());
	System.out.println(q);
	
	}
}