import java.util.*;
import java.lang.Math.*;
class Q22
{

public static void main(String args[])
{int rem=0,count=-1;
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


}

System.out.println("Decimal to Binary is "+ (int)dec);
}
}