import java.util.*;
public class RohanFactoral
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int i,num,fact=1;
        num=sc.nextInt();
        i=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
     System.out.println("factoral number"+fact);
        
    }
}