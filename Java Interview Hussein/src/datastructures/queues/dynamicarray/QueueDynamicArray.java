package datastructures.queues.dynamicarray;

import java.util.Arrays;

public class QueueDynamicArray<T>
{
	Object[] arrayQueue;
	int rear;
	int front;
	int size;
	
	public QueueDynamicArray(int size)
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
		ensureCapacity(rear+2);
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
	
	private void ensureCapacity(int minCapacity)
	{
		int oldCpacity=getSize();
		if(minCapacity>oldCpacity)
		{
			int newCapacity=oldCpacity*2;
			if(newCapacity<minCapacity)
			{
				newCapacity=minCapacity;
			}
			arrayQueue=Arrays.copyOf(arrayQueue, newCapacity);
		}
	}
	
	public int getSize()
	{
		return arrayQueue.length;
	}
}