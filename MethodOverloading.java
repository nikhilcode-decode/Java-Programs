import java.util.*;
public class MethodOverloading {
	Scanner sc = new Scanner(System.in);
	public static void marks()
	{
//		System.out.println("Enter all subject marks");
//		int eng = sc.nextInt();
//		int hindi=sc.nextInt();
//		int maths=sc.nextInt();
//		int cs=sc.nextInt();
//		System.out.println(eng+hindi+maths+cs);
		//return eng+hindi+maths+cs;
	}
	
	public static float marks(float eng,float hindi,float maths,float cs)
	{
		
		return (eng+hindi+maths+cs)/4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.marks();
		System.out.println(marks(4,6,5,3));
		
	}

}
