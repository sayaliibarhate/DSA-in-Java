import java.util.*;

public class InsertionSort
{
	static void insertionsort(int[] ar) {
   		for (int i = 1; i < ar.length; i++) {
       			int temp = ar[i];
        		int j;
        		// Use a for loop to shift elements of the sorted segment to the right
        		for (j = i - 1; j >= 0 && ar[j] > temp; j--) {
            		ar[j + 1] = ar[j];
       		}
        	// Place temp at the correct position
        	ar[j + 1] = temp;
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

		insertionsort(ar);

		System.out.print("\n\nThe sorted array is: ");
		for( int i=0 ; i<ar.length ; i++)
		{
			System.out.print(ar[i]+"\t");
		}

	}
}