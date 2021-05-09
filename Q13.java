import java.io.*;
import java.util.*;
class Q13
{
	public static void main(String args[])
	{
		double PI=Math.PI;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the width");
		double w=sc.nextDouble();
		System.out.println("enter the height"); 
		double h=sc.nextDouble();
		System.out.println("Area is"+(w*h));
		System.out.println("perimeter is "+((w+h)+(w+h)));
	}
}