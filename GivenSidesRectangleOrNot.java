import java.util.Scanner;

import org.omg.CORBA.TRANSACTION_UNAVAILABLE;

public class GivenSidesRectangleOrNot {
	public static void main(String[]agrs)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a,b,c,d");
int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
if(isRectangle(a,b,c,d))
{System.out.println("Yes its a Rectangle");
	}
else
{System.out.println("Not a rectangle");
}

}
	static boolean isRectangle(int a,int b ,int c,int d)
	{
		if(a==b && b==c && c==d && d==a)
		{return true;
	}
		else if(a==b && c==d)
		{return true;}
		
	else if(a==c && b==d)
	{
		return true;
	}
	else if(a==d && b==c)
	{
	return true;	
	}
	else
		return false;

}
}

