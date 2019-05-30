//소수(약수가 1과 자기 자신) 구하기 => 나눌숫자 반까지 나눠보기
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
					cnt++;	break;					//헛도는 부분 제거 가능
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
				for (b = 2; b < a / 2; b++ )	//a=2, b=2일때는 두번째 for문의 조건을 충족하지 못해 for문에 걸리지 않고 출력됨
				{
					if (a % b == 0)
					{
						continue out;			//out:for 구문으로 감.
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
