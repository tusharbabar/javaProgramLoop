import java.util.*;
public class Largesecnumber
   {
        public static void main(String x[])
     {
       Scanner sc=new Scanner(System.in);
         int a[]=new int[5];
         int largest=-1,slargest=-1;
         System.out.println("enter values in array");
        for(int i=0; i<a.length; i++)
           {
             a[i]=sc.nextInt();
            }
         System.out.println("\n display array values");
         for(int i=0; i<a.length; i++)
            {
               System.out.printf("\t%d",a[i]);
            }
              for(int i=0; i<a.length; i++)
             {
                  if(a[i]>largest)
                {
                slargest=largest;
                  largest=a[i];
                }
             else if(a[i] <largest && a[i]>slargest)
             {
               slargest=a[i];
             }
           else{
                }
            }
           System.out.printf("\n second highest is %d\n",slargest);
        }
    }