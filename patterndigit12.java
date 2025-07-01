public class patterndigit12
	{
       public static void main(String x[])
	   {
        int count;
        for(int i=1; i<=5;i++)
		{
			count=i;
			for(int j=1;j<=9;j++)
			{
				if(j<=i )
				{
					System.out.printf("%d",count);
                    
						
               }
			else{
                 System.out.print(" ");
                }
			}
        System.out.println();
        }
     }
 } 
