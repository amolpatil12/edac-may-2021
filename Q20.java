import java.util.*;
class Q20
{
public static void main(String args[])
{
  int i=0,p=0;
  char [] s= new char[20];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter decimal no");
  int no=sc.nextInt();
  while(no!=0)
{
p=no%16;
no=no/16;
if(p<10)
{
s[i]=(char)(p+48);
i++;
}
else
{
s[i]=(char)(p+55);
i++;
}


}
System.out.println("Deciamal to Hexadecimal conversion is ");
for(int j=i-1;j>=0;j--)
System.out.print(s[j]);
}
}