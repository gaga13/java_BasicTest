//for문 구구단

class GuGuDan1
{
	public static void main(String[] args) 
	{
		int a, b, c, d;
		
		//1. 한개 단 출력하기
		a = 3;
		for ( b = 1; b <= 9; b++ )
		{
			System.out.printf("%d * %d = %2d\n", a, b, a * b);
		}
		System.out.println("----------------");

		//2. 세로 방향으로 9개 단 출력하기
		for ( b = 1; b <= 9; b++ )
		{
			for (c = 1; c <= 9; c++ )
			{
				System.out.printf("%d * %d = %2d\n", b, c, b * c);
			}
		}
		System.out.println("----------------");

		//3. 가로 방향으로 9개 단 출력하기
		for ( b = 1; b <= 9; b++ )
		{
			for ( c = 1; c <= 9; c++ )
			{
				System.out.printf("%d * %d = %3d  ", b, c, b * c);
			}
			System.out.println();
		}
		System.out.println("----------------");

		//4. 가로 방향으로 3개 단씩 9개 단 출력하기

		for (a = 1; a <= 9; a += 3) 
			{
				for (b = 1; b <= 9; b++) 
					{
						for (c = a; c <= a + 2; c++)
						{
							System.out.printf("%d*%d=%2d  ", c, b, c * b);
						}	
						System.out.println();
					}
					System.out.println();
			}
		System.out.println("---------------------------------------------");
	}
}
