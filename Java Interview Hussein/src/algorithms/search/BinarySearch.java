package algorithms.search;

public class BinarySearch
{
	public static void main(String[] args)
	{		
		int[] array=Dataset.generateSortedArray(80000000);
		
		double start=System.currentTimeMillis();
		binarySearch(array, 5494131);
		double end=System.currentTimeMillis();
		double timeTaken=(end-start)/1000;
		
		System.out.println("Algorithm ran for "+timeTaken+" seconds.");
	}
	
	// the array must be sorted FIRST!
	public static void binarySearch(int[] array, int numberToSearch)
	{
		int count=0;
		int low=0;
		int mid=0;
		int high=array.length;
		boolean isFound=false;
		
		while(!isFound)
		{
			mid=low+((high-low)/2);
			if(numberToSearch==array[mid])
			{
				isFound=true;
				System.out.println("It took "+count+" iterations.");
				break;
			}
			else if(numberToSearch<array[mid])
			{
				count++;
				high=mid-1;
				isFound=false;
			}
			else if(numberToSearch>array[mid])
			{
				count++;
				low=mid+1;
				isFound=false;
			}
		}

	}
}