package LinearSearch;

public class BinarySearch {
	
	public int BinarySearches(int arr[],int x)
	{
		int l=0,r=arr.length-1;
		while(l<=r)
		{
			int m=1+(r-1)/2;
			if(arr[m]==x) {
				return m;
			}
			if(arr[m]<x)
			{
				return m+1;
			}
			else {
				r=m-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.BinarySearches(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at "+ "index " + result);
        System.out.println("Element is "+ x);

	}

}
