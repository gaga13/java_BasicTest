//2개 정수 입력받아 그 값들의 유니코드 알아보기

import java.util.Scanner;

class ForTest8 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a, b, cnt;							//int로 선언하고 출력시 char로 변환하는게 간편
		
		cnt = 0;								//cnt 초기화 잊지말기!!

		System.out.print("몇 번부터 : ");
		a = scan.nextInt();

		System.out.print("몇 번까지 : ");
		b = scan.nextInt();
		
		for (; a <= b ; a++ )
		{
			System.out.print(a + ": " + (char)a + "  " );
				
					cnt++;
				
					if (cnt % 5 == 0)
				{
					System.out.println();
				}
		    
		}
	}
}
