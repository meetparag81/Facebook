package pot;

public class MissingNumberFromArray1 
{
	// Function to find missing number
	static int getMissingNo (int a[], int n)
	{
		int i, total;
		total = (n+1)*(n+2)/2; 
		//System.out.println(total);
		for ( i = 0; i< n; i++)
		total -= a[i];
		//System.out.println(total);
		return total;
	}
	
	/* program to test above function */
	public static void main(String args[])
	{
		int a[] = {1,2,4,5,6};
		int miss = getMissingNo(a,5);
		System.out.println(miss);
	}
}


