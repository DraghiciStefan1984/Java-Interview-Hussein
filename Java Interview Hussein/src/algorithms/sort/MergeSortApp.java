package algorithms.sort;

import algorithms.search.Dataset;

public class MergeSortApp
{

	public static void main(String[] args)
	{
		MergeSort mergeSort=new MergeSort();
		int[] array=Dataset.generateRandomArray(80000);
		
		double start=System.currentTimeMillis();
		mergeSort.prepareForMergeSort(array);
		double end=System.currentTimeMillis();
		double timeTaken=(end-start)/1000;
		
		System.out.println("Algorithm ran for "+timeTaken+" seconds.");
	}
}