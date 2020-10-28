
public class MyExam3
{

	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 1;
		Add1(num1, num2);
		Add2(num1, num2);
		
		for (int i=0; i<10; i++) 
		{
			System.out.println(i);
			int numX = 0;
			System.out.println(numX);
		}
		System.out.println(num1);
		Add2(5, 2);
		//Add2 num3에 5 대입, num4에 2 대입
	}
	public static void Add1(int num1, int num2) 
	{
		System.out.println(num1 + num2);
	}
	public static void Add2(int num3, int num4)
	//int num3 = main 의 num1 대입(10)
	//int num4 = main 의 num2 대입(1)
	{
		int num1 = num3;
		int num2 = num4;
		
		System.out.println(num1 +num2);
		System.out.println(num3 + "+" +num4);
	}

}
