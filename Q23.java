import java.util.*;
import java.lang.Math.*;
class Q23
{

public static void main(String args[])
{
  int rem=0,count=-1;
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

System.out.println(dec);
int i=0,p=0;
char [] s= new char[100];

while(dec!=0)
{
   p=(int)(dec%16);
   dec=(int)(dec/16);

//System.out.println(p+" "+dec);
  if(p<10)
   {
    s[i]=(char)(p+48);
    i++;
//System.out.println(s[i]);
   }
  else
   {
     s[i]=(char)(p+55);
     i++;
     
//System.out.println(s[i]);
   }
}
System.out.print("Binary to Hexadecimal conversion is ");
for(int j=i-1;j>=0;j--)
System.out.print(s[j]);

}
}