/*[1]
for문을 이용하여 Fibonacci 수열을 10개 출력하시오.
피보나치 수열이란 처음 두 항을 1과 1로 한 후, 그 다음 항부터는 바로 앞의 두 개의 항을 더해 만드는 수열을 말한다.

* 실행결과
1  1  2  3  5  8  13  21  34  55
*/


class P2 
{
	public static void main(String[] args) 
	{
		int a, b, c;
		a = 1;
		b = 1;
		System.out.print(a + " " + b + " ");

		for (int i = 0;  i < 8; i++)
		{
			c = a + b;
			a = b;
			b = c;
			
			System.out.print(c + " ");
		}

/*
 int num1 = 0;
 int num2 = 1;
 int next = 0;

 for(i = 0; i < 10; i++)
		
		


		


	}
}
