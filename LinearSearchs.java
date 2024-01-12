//import java.util.*;
package LinearSearch;
import java.util.*;

public class LinearSearchs {
	
	public static int search(int arr[],int n,int x)
	{
			for(int i=0;i<n;i++)
			{
				if(arr[i]==x)
				{
					return i;
				}
			}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]= {10,20,60,3,5,82,50};
		int x=50;
		int result=search(arr,arr.length,x);
		if(result==-1)
		{
			System.out.println("Element is not presented");
		}
		else{
			System.out.println("Element is : "+ x);
			System.out.println("Element index no is : "+result);
		}

	}

}
