//for���� �̟G�Ͽ� ��������� ���� �Է¹ޱ�

import java.util.Scanner;

class ForTest10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, i;										//�ݺ��ϱ� ���� �� ���� �̸� �ֱ�
		int s = 0;										//�հ� ���� ���� �ʱ�ȭ �ʼ�!!

		for (i = 1;  ; i++ )						//�ݺ��ϰ� ���� ����(���)�� for�� �ȿ� �ֱ�
		{
			System.out.print("���� " + i + " �Է� : " ); 
			n = scan.nextInt();						//�Է� ���� �Է��ϸ� �� ���� ���� ���������
			
			if (n == 0)								// 0�� �ԷµǸ� ����
			{
				break;								//break ����ϸ� ��� ��ȣ�� ������
			}
			if (n < 0)
			{										//  s = s + n - n // n = 0
				continue;							//  continue�� �ݺ� ������ �ʰ� �̹��� �Ѿ
													// continue�� for���� ��� ������-> ���ǽ����� �Ѿ
													// break�� for ������ ��ȣ ������
			}
			s = s + n;								// n�� ���� s�� �����Ǿ���
		}										
			System.out.println("�հ�� : " + s);
			

		// ������ ����, ��� 5�� �ԷµǸ� ����.
		
		for (i = 1; i <=5; i++ )
		{
			System.out.print("����" + i + " �Է� : ");
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
			System.out.print("����" + i + "�Է� : " );

			n = scan.nextInt();
			
			if (n > 0) cnt++;
			
				if (cnt == 5) break;
				
			if (n <= 0)	continue;
		
			s = s + n;
		}
		System.out.println("�հ�� : " + s);*/
	



	}
	}	


	