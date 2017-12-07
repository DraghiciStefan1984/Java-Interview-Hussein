package datastructures.linkedlist;

public class CustomLinkedList<T>
{
	Node head;
	
	public CustomLinkedList()
	{
		head=null;
	}
	
	public void add(Object value)
	{
		Node newNode=new Node(value, null);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void delete()
	{
		head=head.next;
	}
	
	@SuppressWarnings("unchecked")
	public void display()
	{
		Node newNode=head;
		while(newNode!=null)
		{
			System.out.println((T)newNode.value);
			newNode=newNode.next;
		}
	}
}