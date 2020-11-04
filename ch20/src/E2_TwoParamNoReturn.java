interface Calculate3 { void cal(int a, int b); }
					// 매개변수 둘, 반환형 void
public class E2_TwoParamNoReturn
{
	public static void main(String[] args)
	{
		Calculate3 c;
		
		c = (a, b) -> System.out.println("aaa");
		c.cal(4, 3);
		
		c = (a, b) -> System.out.println(a - b);
		c.cal(4, 3);
		
		c = (a, b) -> System.out.println(a * b);
		c.cal(4, 3);
	}
}
