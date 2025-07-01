/*

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

*/

public class pattern11
{
   public static void main(String x[])
	{
      for(int i=1; i<=9;i++)
		{
			for(int j=1; j<=5;j++)
				{
				if(i>=j && i<=5|| j<=10-i && i>=6)
					{
						System.out.printf(" * ");
					}
				else{
						System.out.printf(" ");
                    }
                }
			System.out.println();
        }
     }
}