package datastructures.queues.dynamicarray;

public class App
{
	public static void main(String[] args)
	{
		QueueDynamicArray<Integer> qda=new QueueDynamicArray<>(5);
		qda.enqueue(8);
		qda.enqueue(2);
		qda.enqueue(5);
		qda.enqueue(9);
		qda.enqueue(10);
		System.out.println(qda.dequeue());
		System.out.println(qda.dequeue());
		System.out.println(qda.dequeue());
	}
}