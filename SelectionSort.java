import java.util.*;

public class SelectionSort
{
	static void selectionsort(int[] ar) 
	{
   		for (int i=0 ; i<ar.length-1 ; i++) 
		{
       			int smallest = i;
			for( int j=i+1 ; j<ar.length ; j++)
			{
				if(ar[smallest] > ar[j])
				{
					smallest = j;
				}
			}
			int temp = ar[smallest];
			ar[smallest] = ar[i];
			ar[i] = temp;
		}
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

		selectionsort(ar);

		System.out.print("\n\nThe sorted array is: ");
		for( int i=0 ; i<ar.length ; i++)
		{
			System.out.print(ar[i]+"\t");
		}

	}
}