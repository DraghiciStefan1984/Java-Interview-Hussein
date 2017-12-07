package datastructures.stacks.linkedlist;

public class App
{
	public static void main(String[] args)
	{
		StackLinkedList<Integer> sll=new StackLinkedList<>();
		sll.push(8);
		sll.push(9);
		sll.push(28);
		sll.push(35);
		sll.push(16);
		sll.push(22);
		sll.push(44);
		sll.push(22);
		sll.push(55);
		sll.push(77);
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
	}
}