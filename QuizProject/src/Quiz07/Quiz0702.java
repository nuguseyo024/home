package Quiz07;

public class Quiz0702
{

	public static void main(String[] args)
	{
		Big(1,10,300);
	}
	public static void Big(int n1,int n2,int n3)
	{
		if(n1>n2 && n1>n2)
			System.out.println(n1);
		else if(n2>n1 && n2>n3)
			System.out.println(n2);
		else if(n3>n1 && n3>n2)
			System.out.println(n3);
	
	}

}
//문제2
//세 개의 정수를 인자로 전달 받아서 그중 가장 큰 수를 반환하는 함수를 정의하라