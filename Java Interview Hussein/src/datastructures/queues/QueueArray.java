package datastructures.queues;

public class QueueArray<T>
{
	Object[] arrayQueue;
	int rear;
	int front;
	int size;
	
	public QueueArray(int size)
	{
		this.size=size;
		arrayQueue=new Object[this.size];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull()
	{
		return (rear==size-1);
	}
	
	public boolean isEmpty()
	{
		return (rear==-1 || front>rear);
	}
	
	public void enqueue(Object newItem)
	{
		if(isFull())
		{
			System.out.println("Queu is full.");
			return;
		}
		rear++;
		arrayQueue[rear]=newItem;
		
		if(front==-1)
		{
			front=0;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queu is empty.");
			return null;
		}
		T outElement=(T) arrayQueue[front];
		front++;
		return outElement;
	}
}