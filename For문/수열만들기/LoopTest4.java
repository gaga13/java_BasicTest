//for문 중복사용하여 수열만들기
class LoopTest4 
{
	public static void main(String[] args) 
	{
		int i, j;

/*
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
*/
		for (i = 1 ; i <= 5 ; i++)
		{
			for (j = 1; j <= i ; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();

		}
		System.out.println();
/*
5 4 3 2 1
4 3 2 1 
3 2 1
2 1
1
*/
		for (i = 5; i > 0 ;	i--)
		{
			for (j = i; j > 0 ; j-- )
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();

/*
1 2 3 4 5 
2 3 4 5 6
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9
*/

		for (i = 1 ; i < 6 ; i++)
		{
			for (j = i; j < i + 5; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	
/*
1 0 0 0 0
0 1 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 1
*/

		for (i = 0; i < 5 ; i++ )
		{
			for (j = 0; j < 5; j++ )
			{
				{
					System.out.print((i == j ? 1 : 0) + " ");
				}
			}
			System.out.println();
		}
		System.out.println();

/*
1 0 0 0 0
0 2 0 0 0
0 0 3 0 0
0 0 0 4 0
0 0 0 0 5
*/

		for (i = 1; i <= 5 ; i++ )
		{
			for (j = 1; j <= 5; j++ )
			{
				{
					System.out.print((i == j ? i : 0) + " ");
				}
			}
			System.out.println();
		}
		System.out.println();

/* 
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
		//1
		for (i = 1; i < =25 ; i++ )
		{
			
		}

		//2
		int n = 0;
		for (i = 0; i < 5; i++ )
		{
			for (j = 0; j < 5 ; j++ )
			{
				System.out.print(++n + " ");
			}
			System.out.println();
		}
		System.out.println("------------");



	}
}
