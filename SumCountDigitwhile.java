import java.util.*;
public class SumCountDigitwhile
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int no=sc.nextInt();
int count=0;
while(no>0)
{
no=no/10;
count++;
}
System.out.println("digit count"+count);
}
} 