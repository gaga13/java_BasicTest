//���� ������ 5�� ������ ��� ��. ������ ����� ����
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
			System.out.print("����" + i + "�Է� : " );

			n = scan.nextInt();
			
			if (n > 0) cnt++;
			
				if (cnt == 5) break;
				
			if (n <= 0)	continue;
		
			s = s + n;
		}
		System.out.println("�հ�� : " + s); */

		/* for (i = 1; i <=5; i++ )
		{
			System.out.print("����" + i + " �Է� : ");
			n = scan.nextInt();

			if (n <= 0)
			{
				i--;
				continue;
			}
			s = s + n;
		}

		System.out.println("�հ�� : " + s); */
	
	}
}
