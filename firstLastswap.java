import java.util.*;
public class firstLastswap
{
    public static void main(String x)
    {
        Scanner sc=new Scanner(System.in);
        int x=1,n,first,last,midz;
        System.out.println("enter a number");
        n=sc.nextInt();
        int temp=n;
        while(n>0){
              n=n/10;
              x=x*10;
              
        }
            first=temp/x;
            last=temp%/10;
            mid=(temp%x)/10;
            z=(fast*x)+(mid*10)+first;
            system.out.println(z);
            
    }
}