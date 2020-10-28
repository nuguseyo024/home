class Calc
{
	int add(int a, int b) 
	{
		return a+ b;
	}
}
class Calculation
{
	static void disp()
	{
		int nRtn;
		Calc calc = new Calc();
		nRtn = calc.add(3,  9);  //위에서 만든 class Calc 에 있는 int add(int a, int b)에 대입
		System.out.println("3 + 9 = " + nRtn);
		
	}
	public static void main(String[] args) 
	{
		disp();
	}
}