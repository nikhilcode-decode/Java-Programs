package NewKeywords;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String rev ="";
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		s=sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			rev=ch+rev;
		}
		
			System.out.println(rev);
	}

}
