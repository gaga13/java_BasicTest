class ForTest1 
{
	public static void main(String[] args) 
	{
		int i;
	
		//0 1 2 3 4
		for (i=0; i < 5; i++) // i=i+1
		{
			System.out.println("Hello World!");
		}
		
		//0 1 2 3 4 5 6 7 8 9 
		for (i=0; i < 10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		//1 3 5 7 9
		for (i=1; i < 10 ; i=i+2 )
		{
			System.out.print(i + " ");
		}
		System.out.println();
	
		for (i=1; i< 10; i++ )
		{
			if (i % 2 == 1)
			{
				System.out.print(i + " ");
			}
		}	
		System.out.println();

		//0 2 4 6 8
		for (i=0; i < 9 ; i += 2 )
		{
			System.out.println(i + " ");
		}
		System.out.println();

		//10 20 30 40 50 60 70 80 90 100
		for (i=10; i < 101 ; i += 10 )
		{
			System.out.println(i + " ");
		}
		System.out.println();
		
		//5 4 3 2 1
		for (i=5; i > 0 ; i-- )
		{
			System.out.println(i + " ");
		}
		System.out.println();
		
		//1 10 100 1000 10000
		for (i=1; i < 10001 ; i=i*10 )
		{
			System.out.println(i + " ");
		}
		System.out.println();

		//1~100중에서 20과 50을 제외하고 출력
		int cnt = 0;		//횟수세기 : int형 변수 준비
		for (i = 1; i <= 100; i++)
		{
			if (i !=20 && i !=50)
			{
				System.out.println(i + " ");
				cnt++;		// 횟수세기 : 알고싶은 위치에 적기
			
			}
		}
		System.out.println(cnt + "회 실행");
	}
}
