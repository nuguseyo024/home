
public class B_VariableDecl
{

	public static void main(String[] args)
	{
		double num1, num2;	// 여러 개의 변수 동시 선언
		double result;
		
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(result);
		
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// 실수로는 정확한 계산이 불가능하기 때문에 절대 계산은 하지 않는다!!
		
	}

}
