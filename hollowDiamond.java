/* pattern progarm for hollowDiamond

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
********** 

 */








public class hollowDiamond
{
    public static void main (String x[])
    {
        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
            if(i<=6-j || i>=5+j || j<=6-i||j>=5+i|| j>=16-i)
            {
                System.out.printf("*");
            }else
            {
                System.out.printf(" ");
            }
            
        }
        System.out.printf("\n");
    }
  }
}