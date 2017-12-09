package algorithms.sort;

import algorithms.search.Dataset;

public class SelectionSort
{
	public static void main(String[] args)
	{		
		int[] array=Dataset.generateRandomArray(80000);
		
		double start=System.currentTimeMillis();
		selectionSort(array);
		double end=System.currentTimeMillis();
		double timeTaken=(end-start)/1000;
				
		System.out.println("Algorithm ran for "+timeTaken+" seconds.");
	}
	
	public static void selectionSort(int[] array)
	{
		int count=0;
		int index=0;
		
		for(int i=0; i<array.length-1; i++)
		{
			index=i;
			for (int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[index])
				{
					index=j;
				}
			}
			if(index!=i)
			{
				int temp=array[index];
				array[index]=array[i];
				array[i]=temp;
			}
			count++;
		}
		
		System.out.println("Array sorted, it took "+count+" iterations.");
	}
}