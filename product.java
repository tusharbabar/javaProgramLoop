import java.util.*;
public class product
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int n,pro=1,id;
        System.out.println("enter a number");
        n=sc.nextInt();
        while(n!=0)
        {
            id=n%10;
            pro=pro*id;
            n=n/10;
        }
        System.out.println("product of digit"+pro);
        
    }
}