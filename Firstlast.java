import java.util.*;
public class FirstLast
{
public static void main(String args[])
{
int n,temp,count,x,i,first,mid,last;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
temp=n;
count=0;
while(n>0)
{
count++;
n=n/10;
}
System.out.println("number of digit are"+count);
x=1;
i=1;
while(i<count)
{
x=x*10;
i++;
}
System.out.println("x factor is "+x);
n=temp;
last=n%10;
first=n/x;
mid=(n%x)/10;
n=last*x+mid*10+first;
System.out.println("result is "+n);
}
}