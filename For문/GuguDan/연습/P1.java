class P1 
{
	public static void main(String[] args) 
	{
		// ���� �������� 3�� �ܾ� 9�� �� ����ϱ�
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
