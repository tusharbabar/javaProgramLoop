import java.util.*;
public class NeonNum
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sq=n*n;
        int sqsum=0;
        while(sq!=0)
        {
            int d=sq%10;
            sqsum+=d;
            sq/=10;
        }
        if(sqsum==n)
        System.out.println("number is neon");
        else
        System.out.println("number is not neon");
    }

}