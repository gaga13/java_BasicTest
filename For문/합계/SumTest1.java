//�հ賻��
import java.util.Scanner;

class SumTest1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int i, s, s2, a;

		s = 0;
		s2 = 0;
		
		System.out.print("���� �Է� : ");
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
		System.out.println(a + "������ Ȧ������ �հ� : " + s );
		System.out.println(a + "������ ¦������ �հ� : " + s2 );
		System.out.println(a + "���� ���ڵ��� �հ� : " + (s + s2) );
		
		//System.out.printf("Ȧ�� �հ� :%d\n¦�� �հ� : %d\n�հ� : %d ", s, s2, (s + s2));  
	 

		/*
		for (i = 1; i <= 10 ; i++ )			//��꿡 ���Ǵ� ���� ��Ģ���� �� for�� ���
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

