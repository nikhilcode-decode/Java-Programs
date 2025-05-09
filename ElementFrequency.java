
import java.util.Scanner;
public class ElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the element of array : ");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			
}
		 boolean[] visited = new boolean[n];
		 
	        System.out.println("Element occurrences:");
	        for (int i = 0; i < n; i++) {
	            if (visited[i]) continue;

	            int count = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }

	            System.out.println(arr[i] + " occurs " + count + " time(s)");
	        }
	    }
	

}
