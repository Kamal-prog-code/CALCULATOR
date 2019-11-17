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
		add a = new add();
		div d = new div();
		sub s = new sub();
		mul m = new mul();
		int ad = a.Addition(x,y);
		int su = s.Sub(x,y);
		int di = d.Div(x,y);
		int mu = m.Mul(x,y);
		System.out.println("Pick up the choices 1.add 2.sub 3.mul 4.div");
		if(choice=="1")
		{System.out.println("Addition : "+ad);}
		else if(choice=="2")
		{System.out.println("Subtraction : "+su);}
		else if(choice=="3")
		{System.out.println("Multiplication : "+mu);}
		else
		{System.out.println("Division : "+di);}
	}
}
