/* 
  Digit pattern

    1
   232
  34543
 4567654
567898765

*/

public class patterndigit
	{
       public static void main(String x[])
	   {
        int count;
        for(int i=1; i<=5;i++)
		{
			count=i;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.printf("%d",count);
                    if(j<5)
                    {
						++count;
					}else{
                           --count;
						  }
               }
			else{
                 System.out.print(" ");
                }
			}
        System.out.println();
        }
     }
 } 
