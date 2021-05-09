import java.util.*;
class Q19
{
public static void main(String args[])
{int rem=0,i=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter decimal no");
  int no=sc.nextInt();
  while(no!=0)
{
rem=no%2;
no=no/2;
rem=rem+rem*i;
i=i*10;

}
System.out.println("Decimal to Binary is "+rem);
}
}