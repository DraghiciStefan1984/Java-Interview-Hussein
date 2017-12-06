package datastructures.dynamicarray;

public class App
{
	public static void main(String[] args)
	{
		DynamicArray<Integer> dynArray=new DynamicArray<>();
		dynArray.put(11);
		dynArray.put(18);
		dynArray.put(8);
		dynArray.put(21);
		System.out.println(dynArray.getSize());
		for(int i=0; i<dynArray.getSize(); i++)
		{
			System.out.println(dynArray.getElementAtIndex(i));
		}
	}
}