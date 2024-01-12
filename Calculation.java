
public class Calculation {

	public int func(int a,int b)
	{
		return a+b;
	}
	public int func(int c,int d,int e)
	{
		return c+d+e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c=new Calculation();
		System.out.println(c.func(10, 20));
		System.out.println(c.func(10, 20, 30));
	}

}
