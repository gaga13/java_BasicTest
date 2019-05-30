class P1 
{
	public static void main(String[] args) 
	{
		int i, j, k;

/*
1.
*****
*****
*****
*****
*****
*/

		for (i = 1; i <= 5 ; i++ )
		{
			for (j = 1; j <= 5 ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
/*2.
*
**
***
****
*****
*/
		for ( i = 1; i <= 5; i++ )
		{
			for (j = 1; j <= i ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
/*3.
*****
 ****
  ***
   **
    *
*/
		for (i = 1;	i <= 5; i++ )
		{
			for (j = 1; j <= 5; j++ )
			{
				System.out.print(i <= j ? "*" : " ");
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
			
		for (i = 1; i <= 5 ; i++ )
		{
			for ( j = 1; j <= 5 ; j++ )
			{	
				if (i == j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
/*5.
****
***
**
*
** 
***
****
*/
		for (i = 1; i <= 4; i++)
		{
			for (j = 4; j >= i ;  j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= 3 ; i++)
		{
			for (j = 1; j <= i + 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();


/*6.
     *
    ***
   *****
  *******
 */
		for (i = 1; i <= 4; i++)
		{
			for (j = 4; j > i; j-- )
			{
				System.out.print(" ");
			}
			for (k = 1; k < i * 2; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
