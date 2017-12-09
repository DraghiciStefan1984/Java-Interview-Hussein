package collections;

import java.util.HashSet;
import java.util.Iterator;

public class TSet
{
	public static void main(String[] args)
	{
		HashSet<Integer> set=new HashSet<>();
		set.add(8);
		set.add(8);
		set.add(3);
		set.add(8);
		set.add(18);

		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());	
		}
	}
}