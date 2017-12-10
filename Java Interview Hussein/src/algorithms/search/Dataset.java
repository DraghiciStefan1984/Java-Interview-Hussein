package algorithms.search;

import java.util.Random;

public class Dataset
{	
	private static Random random=new Random();
	private static int[] sortedArray;

	public static int[] generateRandomArray(int size)
	{
		int[] data=new int[size];
		for(int i=0; i<size; i++)
		{
			data[i]=random.nextInt();
		}
		return data;
	}
	
	public static Comparable<Integer>[] generateRandomComparableArray(int size)
	{
		Integer[] data=new Integer[size];
		for(int i=0; i<size; i++)
		{
			data[i]=random.nextInt();
		}
		return data;
	}
	
	public static int[] generateSortedArray(int size)
	{
		sortedArray=new int[size];
		for (int i=0; i<size-1; i++)
		{
			sortedArray[i]=i;
		}
		return sortedArray;
	}
}
