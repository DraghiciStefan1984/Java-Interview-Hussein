package algorithms.sort;

import algorithms.search.Dataset;

public class QuickSort
{
	public static void main(String[] args)
	{		
		int[] array=Dataset.generateRandomArray(80000);
		
		double start=System.currentTimeMillis();
		quickSort(array, 0, array.length-1);
		double end=System.currentTimeMillis();
		double timeTaken=(end-start)/1000;
		
		System.out.println("Algorithm ran for "+timeTaken+" seconds.");
	}
	
	public static void quickSort(int[] array, int low, int high)
	{

		if(low>high)
		{
			return;
		}
		
		int mid=low+(high-low)/2;
		int pivot=array[mid];
		int i=low;
		int j=high;
		
		while(i<=j)
		{
			while(array[i]<pivot)
			{
				i++;
			}
			while(array[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
		}
		
		if(low<j)
		{
			quickSort(array, low, j);
		}
		if(high>i)
		{
			quickSort(array, i, high);
		}
	}
}