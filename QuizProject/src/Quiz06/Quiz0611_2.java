package Quiz06;

public class Quiz0611_2
{

	public static void main(String[] args)
	{
		int num = 1;
		int nResult = 0;
		do 
		{
			if(num % 2 == 0) 
			{
				nResult = nResult + num;
				
			}
			num++;
		}while(num<=100);
		System.out.println(nResult);
		
	}

}
