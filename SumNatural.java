import java.util.*;
public class SumNatural
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int no,i,sum=0;
System.out.println("enter a number");
no=sc.nextInt();
i=1;
while(i<=no)
{
sum=sum+i;
i++;
}
System.out.println("sum="+sum);
}
}