package datastructures.doublelinkedlist;

public class CustomDoubleLinkedList<T>
{
	NodeDouble head;
	
	public CustomDoubleLinkedList()
	{
		head=null;
	}
	
	public void add(Object value)
	{
		NodeDouble newNode=new NodeDouble(value, null, null);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
	}
	
	public void delete()
	{
		head=head.next;
		head.previous=null;
	}
	
	@SuppressWarnings("unchecked")
	public void display()
	{
		NodeDouble newNode=head;
		while(newNode!=null)
		{
			System.out.println((T)newNode.value);
			newNode=newNode.next;
		}
	}
}