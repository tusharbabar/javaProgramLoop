public class reverse9
{
    public static void main (String x[])
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=i; j++)
            {
                if(j%2==0)
                {
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" #");
                  }
            }
            System.out.printf("\n");
        }
    }
}

