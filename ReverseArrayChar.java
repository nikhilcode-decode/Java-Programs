package NewKeywords;
import java.util.*;
public class ReverseArrayChar {
	static Scanner sc = new Scanner(System.in);
	public static void ReverseString(String s)
	{
		System.out.println("Enter String : ");
		s=sc.next();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString(null);

	}

}
