import java.io.*;
import java.util.*;
class Q11
{
public static void main(String args[])
{
	double PI=Math.PI;
Scanner sc= new Scanner(System.in);	
System.out.println("Enter radius");
double r=sc.nextDouble();
System.out.println("Perimeter is "+(2*PI*r));
System.out.println("Area is "+(PI*r*r));

}
}