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
		int ad = a.Addition(x,y);
		int su = s.Sub(x,y);
		int di = d.Div(x,y);
		System.out.println("Pick up the choices 1.add 2.sub 3.div");
		if(choice=="1")
		{System.out.println("Addition : "+ad);}
		else if(choice=="2")
		{System.out.println("Subtraction : "+su);}
		else
		{System.out.println("Division : "+di);}
	}
}
