//for�� ������

class GuGuDan1
{
	public static void main(String[] args) 
	{
		int a, b, c, d;
		
		//1. �Ѱ� �� ����ϱ�
		a = 3;
		for ( b = 1; b <= 9; b++ )
		{
			System.out.printf("%d * %d = %2d\n", a, b, a * b);
		}
		System.out.println("----------------");

		//2. ���� �������� 9�� �� ����ϱ�
		for ( b = 1; b <= 9; b++ )
		{
			for (c = 1; c <= 9; c++ )
			{
				System.out.printf("%d * %d = %2d\n", b, c, b * c);
			}
		}
		System.out.println("----------------");

		//3. ���� �������� 9�� �� ����ϱ�
		for ( b = 1; b <= 9; b++ )
		{
			for ( c = 1; c <= 9; c++ )
			{
				System.out.printf("%d * %d = %3d  ", b, c, b * c);
			}
			System.out.println();
		}
		System.out.println("----------------");

		//4. ���� �������� 3�� �ܾ� 9�� �� ����ϱ�

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
