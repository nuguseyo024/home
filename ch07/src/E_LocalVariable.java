
public class E_LocalVariable
{

	public static void main(String[] args)
	{
		boolean ste = true;
		int num1 = 11;
		if(ste) 
		{
			num1++;
			System.out.println(num1);
		}
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
	}

}
