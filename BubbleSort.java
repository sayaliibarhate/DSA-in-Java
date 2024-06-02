import java.util.*;

public class BubbleSort
{
	static void bubblesort(int[] ar)
	{
		for(int i=0 ; i<ar.length-1 ; i++)
		{
			for(int j=0 ; j<ar.length-i-1; j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
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

		bubblesort(ar);

		System.out.print("\n\nThe sorted array is: ");
		for( int i=0 ; i<ar.length ; i++)
		{
			System.out.print(ar[i]+"\t");
		}

	}
}