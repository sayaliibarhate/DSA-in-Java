import java.util.*;

public class BinarySearch
{
	public static int binarysearch(int[] a, int key)
	{
		
		int low=0, high=a.length-1, mid=0;
		while(low<=high) // because if low becomes gretaer than high it means element is not present in the array
		{
			mid = (low+high) / 2;
			if(key == a[mid])
			{
				return mid;
			}
			else if(key<mid)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the number of elements: ");
		for( int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key to be searched: ");
		int key = sc.nextInt();
		
		Arrays.sort(arr);

		System.out.print("\n\nThe sorted array is: ");
		for( int i=0 ; i<n ; i++)
		{
			System.out.print("\t"+arr[i]);
		}
		
		System.out.print("\n\n"+key+" element is found at "+binarysearch(arr,key)+" position!\n\n");

	}
}
