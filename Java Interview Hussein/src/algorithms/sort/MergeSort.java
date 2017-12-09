package algorithms.sort;

public class MergeSort
{
	private int[] array;
	private int[] tempArray;
	
	public void prepareForMergeSort(int[] array)
	{
		this.array=array;
		this.tempArray=new int[array.length];
		doMergeSort(0, array.length-1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middleIndex=lowerIndex+(higherIndex-lowerIndex)/2;
			doMergeSort(lowerIndex, middleIndex);
			doMergeSort(middleIndex+1, higherIndex);
			mergePart(lowerIndex, middleIndex, higherIndex);
		}
	}

	private void mergePart(int lowerIndex, int middleIndex, int higherIndex)
	{
		for(int i=lowerIndex; i<=higherIndex; i++)
		{
			tempArray[i]=array[i];
		}
		int i=lowerIndex;
		int j=middleIndex+1;
		int k=lowerIndex;
		
		while(i<=middleIndex && j<=higherIndex)
		{
			if(tempArray[i]<=tempArray[j])
			{
				array[k]=tempArray[i];
				i++;
			}
			else
			{
				array[k]=tempArray[j];
				j++;
			}
			k++;
		}
		
		while(i<=middleIndex)
		{
			array[k]=tempArray[i];
			k++;
			i++;
		}
	}
}