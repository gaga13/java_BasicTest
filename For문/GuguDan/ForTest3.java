//정수 입력 : 3
// 3*1=3 3*2=6 ``` 3*9=9 까지

import java.util.Scanner;

class ForTest3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.print("정수 입력 : ");
		a = scan.nextInt();

		for (b = 1; b < 10; b++)
		{
			System.out.println(a + "*" + b + " = " + a * b );
		}
	}
}
