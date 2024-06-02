import java.util.*;

public class LinearSearch
{
	public static int linearsearch(int[] a, int key)
	{
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] == key)
			{
				return i;
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

		System.out.println("\n"+key+" element is found at "+linearsearch(arr,key)+" position!");

	}
}

