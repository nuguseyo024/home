
public class D_OnlyExitReturn
{

	public static void main(String[] args)
	{
		divide(6,2);
		divide(9,0);
		divide(4,2);
		divide(1231231,2323);
		divide(123123124,7654);
		
	}
	public static void divide(double num1, double num2)
	{
		if(num2 == 0) 
		{
			System.out.println("0으로 나눌 수 X");
			return;
		}
		System.out.println("값 : " + (num1/num2));
	}

}
