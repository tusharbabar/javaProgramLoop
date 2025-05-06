import java.util.*;
public class Multipaltabel
{
    public static void main(String x[])
    {
        int i,no,mul=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        no=sc.nextInt();
        i=1;
        while(i<=10)
        {
            mul=no*i;
            System.out.println(mul);
            i++;
        }
    }
}