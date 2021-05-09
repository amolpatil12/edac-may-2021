import java.util.*;
class Q21
{

public static void main(String args[])
{int rem=0,i=1,oct=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter decimal no");
  int no=sc.nextInt();
  while(no!=0)
{
rem=no%8;
no=no/8;
oct=oct+(rem*i);
i=i*10;

}
System.out.println("Decimal to Binary is "+oct);
}
}