import x.*;
import java.util.*;
public class calculation
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String choice = null;
		int x = s.nextInt();
		int y = s.nextInt();
		choice = scan.nextLine();
		calculation cl = new calculation();
		int add = cl.Addition(x,y);
		int sub = cl.Sub(x,y);
		int div = cl.Div(x,y);
		System.out.println("Pick up the choices 1.add 2.sub 3.div");
		if(choice=="1")
		{System.out.println("Addition : "+add);}
		else if(choice=="2")
		{System.out.println("Subtraction : "+sub);}
		else(choice=="3")
		{System.out.println("Division : "+div);}
	}
}
