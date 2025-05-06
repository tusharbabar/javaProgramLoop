import java.util.*;
public class FactorialApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int no=sc.nextInt();
int fact=1;
while(no!=0)
{
fact=fact*no;
no--;
}
System.out.println("factorial is  "  +fact);
}
}