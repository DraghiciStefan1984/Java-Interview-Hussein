package datastructures.stacks.dynamicarray;

import java.util.Arrays;

public class StackDynamicArray<T>
{
	Object[] arrayStack;
	int size;
	int top;
	
	public StackDynamicArray(int size)
	{
		this.size=size;
		arrayStack=new Object[size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	private void ensureCapacity(int minCapacity)
	{
		int oldCpacity=arrayStack.length;
		if(minCapacity>oldCpacity)
		{
			int newCapacity=oldCpacity*2;
			if(newCapacity<minCapacity)
			{
				newCapacity=minCapacity;
			}
			arrayStack=Arrays.copyOf(arrayStack, newCapacity);
		}
	}
	
	public void push(Object newItem)
	{
		ensureCapacity(top+2);
		top++;
		arrayStack[top]=newItem;
	}
	
	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty.");
			return null;
		}
		@SuppressWarnings("unchecked")
		T itemToPop=(T) arrayStack[top];
		top--;
		return itemToPop;
	}
}
