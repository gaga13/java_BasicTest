//�Ҽ�(����� 1�� �ڱ� �ڽ�) ���ϱ� => �������� �ݱ��� ��������
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int a, b, cnt;
		
		//1
		for (a = 2; a < 100; a++)
		{
			for (b = 2; b <= a; b++)
			{
				if (a % b == 0) 
				{
					if (a == b)	System.out.printf("%3d", a);
					else break;
				}	
			}	
		}

		//2
		for (a = 2; a < 100; a++ )
		{
			for (b = 2; b <= a; b++ )
			{
				if (a % b == 0)
					cnt++;	break;					//�굵�� �κ� ���� ����
			}

			if (cnt == 1)
			{
				System.out.prinf("%3d", a);
			}
		}

		//3
		out:
			for (a = 2; a < 100; a++)
			{
				for (b = 2; b < a / 2; b++ )	//a=2, b=2�϶��� �ι�° for���� ������ �������� ���� for���� �ɸ��� �ʰ� ��µ�
				{
					if (a % b == 0)
					{
						continue out;			//out:for �������� ��.
					}
				}
				System.out.printf("%3d", a);
			}

		//4
		for (a = 2; a < 100; a++ )
			{
				for (b = 2; b <= a / 2; b++)
				{
					if (a % b == 0)
					{
						break;
					}
				}
				if (b > a / 2)
				{
					System.out.prinf("%3d", a);
				}
			}
			System.out.println();
			
	}
}
