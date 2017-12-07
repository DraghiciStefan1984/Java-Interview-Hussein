package datastructures.stacks.array;

public class App
{
	public static void main(String[] args)
	{
		StackArray<Integer> sa=new StackArray<>(10);
		sa.push(8);
		sa.push(9);
		sa.push(28);
		sa.push(35);
		sa.push(16);
		sa.push(22);
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
	}
}