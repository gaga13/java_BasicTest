class LoopTest5 
{
	public static void main(String[] args) 
	{
		int i, j, z;
		String n;
		
/*
1.
*****
*****
*****
*****
*****
*/
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
/*2.
*
**
***
****
*****
*/
		for (i = 1; i <= 5; i++ )
		{
			for (j = 1; j <= i; j++ )
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		System.out.println("------------");
/*3.
*****
 ****
  ***
   **
    *
*/
		//1)
		for (i = 1; i <= 5; i++ )
		{
			for (j = 1; j <= 5; j++)
			{
				System.out.print( i <= j ? "*" : " ");
			}
			System.out.println();
		}

		//2)
		for (i = 0; i < 5; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for (z = i; z < 5 ; z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//3
		for (i = 1; i <= 5; i++ )
		{
			for (j = 1; j <= 5; j++ )
			{
				if (i > j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
	
			}
			System.out.println();
		}
		
/*4.
  *
   *
    *
     *
	  *
*/
		for (i = 1; i <= 5; i++)
		{
			for (j = 1; j <= 5; j++)
			{			
				System.out.print(i == j? "*":" ");		
			}
			System.out.println();
		}
		System.out.println("------------");
/*5.
****
***
**
*
**
***
****
*/
		for (i = 4; i > 0; i--)
		{
			for (j = i; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 2; i <= 4; i++ )
		{
			for (j = 1; j <= i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");

/*6.
     *
    ***
   *****
  *******
 */
		//1
		for (i = 1; i < 6 ; i++)
		{	
			for (j = 6; j > i; j-- )
			{
				System.out.print(" ");
			}
			for (j = 1; j < 2 * i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");

		//2
		for (i = 1; i <= 4; i++ )
		{
			for (j = 1; j < i + 4; j++ )
			{
				if ( j <= 4 - i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
