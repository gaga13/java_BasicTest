//n! = 1���� n���� ��� ���� ��
import java.util.Scanner;

class SumTest2

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int i, n, s;
		s = 1;

		System.out.print("���� �Է� : ");

		n = scan.nextInt();
	

		for (i = 1; i <= n ; i++)
		{
			s *= i;
			
		}
		System.out.println(n + "! = " + s);
	}
}
