//양의 정수가 5개 들어오면 계산 끝. 음수는 몇개던지 무시
import java.util.Scanner;

class ForTest10_2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, i, cnt, s;
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
		System.out.println("합계는 : " + s); */

		/* for (i = 1; i <=5; i++ )
		{
			System.out.print("정수" + i + " 입력 : ");
			n = scan.nextInt();

			if (n <= 0)
			{
				i--;
				continue;
			}
			s = s + n;
		}

		System.out.println("합계는 : " + s); */
	
	}
}
