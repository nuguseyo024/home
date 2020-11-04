interface Calculate4 { int cal(int a, int b); }
					// 매개변수 둘, 반환형 void
public class E3_TwoParamAndReturn
{
	public static void main(String[] args)
	{
		Calculate4 c;
		
		c = (a, b) -> { return a + b; };
		int num = c.cal(4, 3);  
		System.out.println(c.cal(4, 3));
		System.out.println(num);
		
		c = (a, b) -> a + b;	
		// 중괄호 안의 구현부가 반환문 하나라면 return과 중괄호 생략 가능
		System.out.println(c.cal(4, 3));		
		
	}
}
// 메서드 몸체에 해당하는 내용이 return 문이면 
// 그 문장이 하나이더라도 중괄호의 생략이 불가능
