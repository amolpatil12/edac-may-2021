import java.util.*;
import java.lang.Math.*;
class Q25
{

public static void main(String args[])
{int rem=0,count=-1;
double oct=0;
Scanner sc=new Scanner(System.in);
  System.out.println("Enter octal no");
  int no=sc.nextInt();
  while(no!=0)
{
rem=no%10;
no=no/10;
count++;
oct=oct+(rem*Math.pow(8,count));


}

System.out.println("octal to decimal "+(int) oct);
}
}