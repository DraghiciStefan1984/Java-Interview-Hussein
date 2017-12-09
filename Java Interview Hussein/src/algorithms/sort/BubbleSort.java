package algorithms.sort;

import algorithms.search.Dataset;

public class BubbleSort
{
	public static void main(String[] args)
	{		
		int[] array=Dataset.generateRandomArray(80000);
		
		double start=System.currentTimeMillis();
		bubbleSort(array);
		double end=System.currentTimeMillis();
		double timeTaken=(end-start)/1000;
		
//		System.out.println("=======================");
//		for(int i=0; i<array.length; i++)
//		{
//			System.out.println(array[i]);
//		}
		
		System.out.println("Algorithm ran for "+timeTaken+" seconds.");
	}
	
	public static void bubbleSort(int[] array)
	{
		int count=0;
		int temp=0;
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=1; j<(array.length-i); j++)
			{
				if(array[j-1]>array[j])
				{
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					count++;
				}
			}
		}
		
		System.out.println("Array sorted, it took "+count+" iterations.");
	}
}