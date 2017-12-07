package datastructures.linkedlist;

public class App
{

	public static void main(String[] args)
	{
		CustomLinkedList<String> cls=new CustomLinkedList<>();
		cls.add("ssdfsd");
		cls.add("rghtrh");
		cls.add("cvbc");
		cls.add("awswa");
		cls.display();
		
		System.out.println("============");
		cls.delete();
		cls.display();
	}

}
