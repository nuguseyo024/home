package Quiz06;

public class Quiz0604_ssam
{

	public static void main(String[] args)
	{
	int num = 1;
	int result = 0;
	int max = 1000;
	do 
	{
		if(num < max)
		{
			System.out.print(num + "+");
		}
		else
		{
			System.out.print(num + "=");
		}
		result = result + num;
		num++;
	}while (num <= max);
	
	System.out.println(result);
		
	}
}

