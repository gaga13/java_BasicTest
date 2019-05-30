//for문에 int형아닌 다른변수(double)써보기

class ForTest9 
{
	public static void main(String[] args) 
	{
		double d;
		
		for (d = 0.0; d < 2.0; d +=0.2 ) //컴퓨터상에서 0.6을 2진수로 입력하기에 딱 떨어지는 값이 나오지 못함
		{								//=> 횟수같은 것은 int로 받아야 정확함
			System.out.println(d);
		}
		
	}
}
