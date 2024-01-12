import java.util.*;
public class Student {
Scanner sc = new Scanner(System.in);

static int math;
static int eng;
	public void marks()
	{
		System.out.println("Enter subject no");
		math=sc.nextInt();
		eng=sc.nextInt();
		System.out.println(math+eng);
		
	}
	public static void average()
	{
		try {
			System.out.println((math+eng)/2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("code sussessfully executed");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.marks();
		average();
	}

}
