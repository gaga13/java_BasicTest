//2개 정수 입력받아 그 값들의 유니코드 알아보기

import java.util.Scanner;

class ForTest8 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int start, end, i, cnt;							//int로 선언하고 출력시 char로 변환하는게 간편
		
		cnt = 0;								//cnt 초기화 잊지말기!!

		System.out.print("시작 코드 : ");
		start = scan.nextInt();

		System.out.print("종료 코드 : ");
		end = scan.nextInt();
		

		if (start > end)
		{
			i = start;
			start = end;
			end = i;
		}
		
        for ( i = start ; i <= end ; i++ )
        {
			System.out.print( i + ": " + (char) i + "\t");
			cnt++;
				if ( cnt % 5 == 0)
				{
					System.out.println();
				}
        }
		System.out.println();

		 
	}
}
