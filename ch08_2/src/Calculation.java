class Calc
{
	int add(int a, int b) 
	{
		return a + b;
	}
}
public class Calculation
{

	public static void main(String[] args)
	{
		Calc calc = new Calc();
		int nRtn = calc.add(3,  9); // 위에 있는 add(int a, int b)에 대입 -> return a(3) + b(9)가 나옴
		System.out.println("3 + 9 = " + nRtn);
		
	}

}
