package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueX
{
	public static void main(String[] args)
	{
		Queue<Integer> queue=new LinkedList<>();
		queue.add(8);
		queue.add(4);
		queue.add(7);
		queue.add(43);
		queue.add(22);
		queue.add(44);
		
		Iterator<Integer> iterator=queue.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("====================");
	
		System.out.println(queue.peek());		
	}
}