/*[문제1]
입력받은 두 정수 사이의 모든 정수를 출력하시오.
큰 수를 먼저 입력해도 같은 결과가 나와야 한다.
---실행결과---
정수1 : 4
정수2 : 8
4 5 6 7 8
*/

import java.util.Scanner;

class ForTest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int start, end, i;

		System.out.print("정수1 입력 : ");
		start = scan.nextInt();

		System.out.print("정수2 입력 : ");
		end = scan.nextInt();

		if (start > end)
		{
			i = start;				//큰수의 값을 입력해도 같은 값 나오게 하기 =>두 개 값 바꾸기
			start = end;
			end = i;
		}

		for(i = start; i <= end; i++ )			//변수가 필요하면 for문 안에서 넣지말고 처음부터 넣기
		{
			System.out.print(i + " " );
		}
			
	}
}

		/* max = start;
		min = end;
		if (max < end) 
		{
			max = end; min = start;
		}
		for (; min <= max; min++)
		{
			System.out.print(min + " ");
		}*/									//변수가 늘어나면 하기 어려울듯
			

