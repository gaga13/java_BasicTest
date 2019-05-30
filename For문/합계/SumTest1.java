//합계내기
import java.util.Scanner;

class SumTest1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int i, s, s2, a;

		s = 0;
		s2 = 0;
		
		System.out.print("정수 입력 : ");
		a = scan.nextInt();
		
		
		for (i = 1; i <= 10 ; i++ )
		{
			if ( i % 2 != 0)
			{
				s = s + i;
			}
			else
			{
				s2 = s2 + i;
			}
		}
		System.out.println(a + "까지의 홀수들의 합계 : " + s );
		System.out.println(a + "까지의 짝수들의 합계 : " + s2 );
		System.out.println(a + "까지 숫자들의 합계 : " + (s + s2) );
		
		//System.out.printf("홀수 합계 :%d\n짝수 합계 : %d\n합계 : %d ", s, s2, (s + s2));  
	 

		/*
		for (i = 1; i <= 10 ; i++ )			//계산에 사용되는 수가 규칙적일 때 for문 사용
		{
			if (i % 2 == 0)
			{
				s = s + i;
			}
			
		}
		System.out.println(s);		
		
		
		for ( i = 2; i <= 10; i += 2 )
		{	
			s = s + i ;
		}
		System.out.println(s);
		*/

	}

}

