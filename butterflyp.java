public class butterflyp
 {
   public static void main(String x[])
   {
     for(int i=1; i<=10;i++)
      {
        for(int j=1; j<=10; j++)
        {
          if(i>=j && i<=11-j|| i>=11-j&& i<=j )
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
