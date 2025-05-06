import java.util.*;
public class Fequency2
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,rem,count,i;
        System.out.println("enter a number");
        n=sc.nextInt();
        temp=n;
        i=0;
        while(i<=9)
        {
            count=0;
            n=temp;
            while(n>0)
             {
                 rem=n%10;
                 if(rem==i)
                 count++;
                 n=n/10;
               }
               if(count>0)
               {
                   System.out.println(i+"---------"+count+"times");
                   
               }
               i++;
             }
        }
}
        
    
