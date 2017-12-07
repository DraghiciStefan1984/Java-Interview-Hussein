package datastructures.doublelinkedlist;

public class App
{

	public static void main(String[] args)
	{
		CustomDoubleLinkedList<String> cls=new CustomDoubleLinkedList<>();
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
