class SumTest3 
{
	public static void main(String[] args) 
	{
		int s, i;
		
		//1
		s = 0;
		for ( i = 1 ;  ; i++ )
		{
			s += i;
				if ( s > 4000 ) break;		
		}
		System.out.println(1 + "~" + i + "������ �հ� : " + s);

		//2
		s = 0;
		for ( i = 1; s <= 4000 ; i++ )
		{
			s += i;
		}
		System.out.println(1 + "~" + (i-1) + "������ �հ� : " + s);
	}
}
