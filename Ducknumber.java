import java.util.*;
public class Ducknumber
{
public static void main(String x[])
{
int no,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
no=sc.nextInt();
while(no!=0)
{
   rem=no%10;
   no=no/10;
  
       if(rem==0) 
{
System.out.println("number is duck");
}
else{
System.out.println("number is not duck");
}
}
}
}
