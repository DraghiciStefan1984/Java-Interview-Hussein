package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class HSet
{
	public static void main(String[] args)
	{
		TreeSet<Integer> set=new TreeSet<>();
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