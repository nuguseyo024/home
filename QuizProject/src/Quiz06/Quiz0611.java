package Quiz06;

public class Quiz0611
{

	public static void main(String[] args)
	{
		int i = 0;
		int result = 0;
		do 
		{			
			i=i+2;
			if(i<100) 
			{
				System.out.print(i + "+");
			}
			else
			{
				System.out.print(i + "=");
			}
			result = result + i;
		}while(i<100);
		System.out.println(result);
	}

}

//문제 06-11  
//1부터 100까지 정수중에서 짝수의 합을 구하라. 
//단 do~while문을 이용하라
