import java.util.*;
public class Reversewhile
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int no,r=0;
        System.out.println("enter a number");
        no=sc.nextInt();
        while(no!=0)
        {
            r=(no%10)+(r*10);
            no=no/10;
        
        }
        System.out.println("reverse number is "+r);
    }
}