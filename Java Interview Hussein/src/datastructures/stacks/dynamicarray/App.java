package datastructures.stacks.dynamicarray;

public class App
{
	public static void main(String[] args)
	{
		StackDynamicArray<Integer> sda=new StackDynamicArray<>(5);
		sda.push(8);
		sda.push(9);
		sda.push(28);
		sda.push(35);
		sda.push(16);
		sda.push(22);
		sda.push(44);
		sda.push(22);
		sda.push(55);
		sda.push(77);
		System.out.println(sda.pop());
		System.out.println(sda.pop());
		System.out.println(sda.pop());
		System.out.println(sda.pop());
	}
}