package algorithms.sort;

import algorithms.search.Dataset;

public class HeapSort
{
	public static void main(String[] args)
	{		
		Comparable<Integer>[] array=Dataset.generateRandomComparableArray(80000);
		
		double start=System.currentTimeMillis();
		sortPart(array);
		double end=System.currentTimeMillis();
		double timeTaken=(end-start)/1000;
		
		System.out.println("Algorithm ran for "+timeTaken+" seconds.");
	}
	
	static int total;
	
	public static void sortPart(Comparable<Integer>[] array)
	{
		total=array.length-1;
		
		for(int i=total/2; i>=0; i--)
		{
			heapPart(array, i);
		}
		for(int i=total; i>0; i--)
		{
			swap(array, 0, i);
			total--;
			heapPart(array, 0);
		}
	}
	
	private static void heapPart(Comparable<Integer>[] array, int i)
	{
		int left=i*2;
		int right=i*2+1;
		int great=i;
		
		if(left<=total && array[left].compareTo((Integer) array[great])>=0)
		{
			great=left;
		}
		if(right<=total && array[right].compareTo((Integer) array[great])>=0)
		{
			great=right;
		}
		if(great!=i)
		{
			swap(array, i, great);
			heapPart(array, great);
		}
	}

	private static void swap(Comparable<Integer>[] array, int a, int b)
	{
		Comparable<Integer> temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
}
