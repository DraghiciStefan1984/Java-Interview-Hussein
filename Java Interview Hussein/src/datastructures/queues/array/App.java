package datastructures.queues.array;

public class App
{
	public static void main(String[] args)
	{
		QueueArray<Integer> qa=new QueueArray<>(5);
		qa.enqueue(8);
		qa.enqueue(2);
		qa.enqueue(5);
		qa.enqueue(9);
		qa.enqueue(10);
		System.out.println(qa.dequeue());
		System.out.println(qa.dequeue());
		System.out.println(qa.dequeue());
	}
}