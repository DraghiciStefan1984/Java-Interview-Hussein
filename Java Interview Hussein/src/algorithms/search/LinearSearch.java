package algorithms.search;

public class LinearSearch
{
	public static void main(String[] args)
	{		
		int[] array=Dataset.generateRandomArray(80000000);
		
		double start=System.currentTimeMillis();
		linearSearch(array, 300);
		double end=System.currentTimeMillis();
		double timeTaken=(end-start)/1000;
		
		System.out.println("Algorithm ran for "+timeTaken+" seconds.");
	}
	
	public static void linearSearch(int[] array, int numberToSearch)
	{
		int count=0;
	
		for (int i=0; i<array.length; i++)
		{
			count++;
			if(array[i]==numberToSearch)
			{
				System.out.println("Number "+numberToSearch+" was found at index "+i);
				System.out.println("It took "+count+" iterations.");
				break;
			}
		}
	}
}