import x.*;

public class calculation
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		calculation cl = new calculation();
		int add = cl.Addition(x,y);
		int sub = cl.Sub(x,y);
		int div = cl.Div(x,y);
		System.out.println("Addition : "+add);
		System.out.println("Subtraction : "+sub);
		System.out.println("Division : "+div);
	}
}
