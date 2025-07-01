import java.util.*;
public class perfectNum
{
    public static void main(String x[])
    {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        for(int i=1; i<num;i++)
           {
               if(num%i==0)
               {
                   sum=sum+i;
               }
           }
           if(sum==num)
           {
               System.out.println("number is perfect");
           }else{
               System.out.println("number is not perfect");
           }
    }
}