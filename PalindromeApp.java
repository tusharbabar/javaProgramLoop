import java.util.*;
public class PalindromeApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num,rev=0;
num=sc.nextInt();
int temp=num;
int rem;
while(num>0)
{
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
if(rev==temp)
{
System.out.println("number is palindrome");
}
else
{System.out.println("number is not palindrome");
}
}
}