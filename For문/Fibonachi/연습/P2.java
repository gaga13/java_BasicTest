/*[1]
for���� �̿��Ͽ� Fibonacci ������ 10�� ����Ͻÿ�.
�Ǻ���ġ �����̶� ó�� �� ���� 1�� 1�� �� ��, �� ���� �׺��ʹ� �ٷ� ���� �� ���� ���� ���� ����� ������ ���Ѵ�.

* ������
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
