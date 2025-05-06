import java.util.*;
public class primenumber
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int count=0,i=1;
while(i<=n)
{
    if(n%i==0)
    {
        count++;
    }
    i++;
}
if(count==2)
System.out.println("number is prime");
else
System.out.println("number is not prime");
}
}
 