/*pattern10

*****
 *****
  *****
   *****
    *****




*/ 

 public class pattern10
{
    public static void main(String x[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=9;j++)
            {
                if(i<=j && j<=4+i)
                {
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
    
}