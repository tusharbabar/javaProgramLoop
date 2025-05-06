import java.util.*;
public class DuckApp
{
    public static void main(String x[])
    {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a number");
    int no,rem;
    boolean flag=false;
    no=sc.nextInt();
    while(no!=0)
    {
        rem=no%10;
        no=no/10;
          if(rem==0)
          flag=true;
          break;
    }
             if(flag)
          {
            System.out.println("number is duck");
            }
            else
            {
            System.out.println("number is not duck");
             }  
         }
    }
    
