package datastructures.stacks.linkedlist;

public class StackLinkedList<T>
{
	Node top;
	
	public StackLinkedList()
	{
		top=null;
	}
	
	public void push(Object value)
	{
		Node newNode=new Node(value, null);
		if(top==null)
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if(top==null)
		{
			System.out.println("Stack is empty.");
			return null;
		}
		T value=(T) top.value;
		top=top.next;
		return value;
	}
	
	@SuppressWarnings("unchecked")
	public void display()
	{
		Node newNode=top;
		while(newNode!=null)
		{
			System.out.println((T)newNode.value);
			newNode=newNode.next;
		}
	}
}