//for문을 이욯하여 계속적으로 변수 입력받기

import java.util.Scanner;

class ForTest10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, i;										//반복하기 전에 할 것은 미리 넣기
		int s = 0;										//합계 구할 변수 초기화 필수!!

		for (i = 1;  ; i++ )						//반복하고 싶은 내용(출력)을 for문 안에 넣기
		{
			System.out.print("정수 " + i + " 입력 : " ); 
			n = scan.nextInt();						//입력 다음 입력하면 그 전의 값이 사라져버림
			
			if (n == 0)								// 0이 입력되면 종료
			{
				break;								//break 사용하면 모든 괄호를 종료함
			}
			if (n < 0)
			{										//  s = s + n - n // n = 0
				continue;							//  continue는 반복 끝나지 않고 이번만 넘어감
													// continue는 for문이 경우 증감식-> 조건식으로 넘어감
													// break는 for 마지막 괄호 끝으로
			}
			s = s + n;								// n의 값이 s에 누적되야함
		}										
			System.out.println("합계는 : " + s);
			

		// 음수는 무시, 양수 5개 입력되면 종료.
		
		for (i = 1; i <=5; i++ )
		{
			System.out.print("정수" + i + " 입력 : ");
			n = scan.nextInt();

			if (n <= 0)
			{
				i--;
				continue;
			}
		}

		/*
		Scanner scan = new Scanner(System.in);

		int n, i, s, cnt;		
		
		s = 0;	
		cnt = 0;

		for (i = 1; ; i++ )
		{
			System.out.print("정수" + i + "입력 : " );

			n = scan.nextInt();
			
			if (n > 0) cnt++;
			
				if (cnt == 5) break;
				
			if (n <= 0)	continue;
		
			s = s + n;
		}
		System.out.println("합계는 : " + s);*/
	



	}
	}	


	