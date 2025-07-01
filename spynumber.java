import java.util.*;
public class spynumber
{
    public static void main(String x[])
    {
        int num,temp,sum=0,product=1;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        while(num!=0)
        {
            temp=num%10;
            sum=sum+temp;
            product=product*temp;
            num=num/10;
            
        }
        if(sum==product)
        {
            System.out.println("spy number");
        }else{
            System.out.println("not spy number");
        }
    }
}