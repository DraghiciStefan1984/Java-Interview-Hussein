package datastructures.stacks.array;

public class StackArray<T>
{
	Object[] arrayStack;
	int size;
	int top;
	
	public StackArray(int size)
	{
		this.size=size;
		arrayStack=new Object[size];
		top=-1;
	}

	public boolean isFull()
	{
		return (top==size-1);
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public void push(Object newItem)
	{
		if(isFull())
		{
			System.out.println("Stack is full.");
			return;
		}
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
