import java.util.*;

public class QuickSort
{
	public static void quicksort(int ar[], int low,int high){
		if(low < high){
			int pidx = partition(ar,low,high);

			quicksort(ar,low,pidx-1);
			quicksort(ar,pidx+1,high);
		}
	}

	public static int partition(int ar[], int low, int high){
		int pivot = ar[high];
		int i = low-1;

		for(int j=low;j<high;j++)
		{
			if(ar[j] < pivot){
				i++;
				//swap
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		//swap for pivot
		i++;
		int temp = ar[i];
		ar[i] = ar[high];
		ar[high] = temp;

		return i;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();

		int[] ar = new int[n];

		System.out.println("Enter the number of elements: ");
		for( int i=0 ; i<ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}

		quicksort(ar,0,n-1);

		System.out.print("\n\nThe sorted array is: ");
		for( int i=0 ; i<ar.length ; i++)
		{
			System.out.print(ar[i]+"\t");
		}

	}
}