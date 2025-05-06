import java.util.*;
public class power
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        int b=sc.nextInt();
        System.out.println("enter a index");
        int ind=sc.nextInt();
        int p=1,i=1;
        while(i<=ind)
        {
            p=p*b;
            i++;
            
        }
        System.out.println("power is "+p);
    }
}