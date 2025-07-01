/* patternstar
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public class patternstar
{
   public static void main(String x[])
   {
    for(int i=1; i<=9;i++)
     {
       for(int j=1; j<=10;j++)
       {
         if(j>=6-i && j<=4+i && i<=5 || j>=i-4 && j<=14-i && i>=6)
          {
            System.out.printf("*");
           }
         else{
               System.out.printf(" ");
             }
        }
     System.out.println();
    }
  }
}


