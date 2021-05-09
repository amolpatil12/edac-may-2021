import java.util.*;
import java.lang.Math.*;
class Q24
{

public static void main(String args[])
{int rem=0,count=-1,oct=0,i=1;
 double dec=0  ;
Scanner sc=new Scanner(System.in);
  System.out.println("Enter binary no");
  int no=sc.nextInt();
  while(no!=0)
{
rem=no%10;
no=no/10;
count++;
dec=dec+(rem*Math.pow(2,count));
//System.out.println(count+" "+(int)dec);

}
int r1=0;
while(dec!=0)
{
r1=(int)dec%8;
dec=dec/8;
//System.out.println(dec);
oct=oct+r1*i;
i=i*10;
}
System.out.println("Binary to Octal is "+ oct);
}
}