package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackX
{
	public static void main(String[] args)
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(8);
		stack.push(3);
		stack.push(2);
		stack.push(9);
		stack.push(7);
		
		Iterator<Integer> iterator=stack.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("====================");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}