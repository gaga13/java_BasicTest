class P1 
{
	public static void main(String[] args) 
	{
		// 가로 방향으로 3개 단씩 9개 단 출력하기
		int a, b, c;

		for (a = 1; a <= 9; a += 3)
		{
			for (b = 1; b <= 9; b++)
			{
				for (c = a; c <= a + 2; c++)
				{
					System.out.prinf("%2d * %2d = %3d", c, b, c * b);
				}
				System.out.println();
			}
		}
	}
}
