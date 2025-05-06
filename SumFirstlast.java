import java.util.*;
public class SumFirstlast
{
    public  static void main(String x[])
    {
        int no,firstdigit=0,lastdigit;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        no=sc.nextInt();
        lastdigit=no%10;
        while(no!=0)
        {
            firstdigit=no%10;
            no=no/10;
            
        }
        sum=firstdigit+lastdigit;
        System.out.println("firstdigit"+lastdigit);
        System.out.println("lastdigit"+firstdigit);
            System.out.println("sum of first and last"+sum);
    }
}