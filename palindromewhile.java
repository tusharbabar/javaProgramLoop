import java.util.*;
public class palindromewhile
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int no=sc.nextInt();
int temp=no;
int r=0;
while(no!=0)
{
r=(no%10)+(r*10);
no=no/10;
}
if(r==temp)
{
System.out.println("number is palindrome");
}
else{
System.out.println("number is not palindrome");
}
}
}