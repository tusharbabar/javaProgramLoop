import java.util.*;
public class fequency
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int d,rem,count=0;
        System.out.println("enter the check fequency number");
        d=sc.nextInt();
        while(n!=0)
        {
            rem=n%10;
            if(rem==0){
                count++;
            }
            System.out.println("fequency is "+count);
            }
    }
}