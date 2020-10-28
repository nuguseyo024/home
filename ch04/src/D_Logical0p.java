
public class D_Logical0p
{

	public static void main(String[] args)
	{
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (1 < num1) && (num1 < 100);
		System.out.println("1 초과 100 미만인가? " + result);
		// && : 내용 모두가 true면 true, 아닐시 false
		
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가? " + result);
		// || : 내용 중 하나만 true면 true, 모두가 false이면 false
		// 어떤 숫자의 배수를 구하고 싶으면 그 수의 나머지를 구하는 식을 쓴다.
		
		result = !(num1 != 0);
		System.out.println("(결과적으로)참이 아니다. " + result);
		// ! : not (~아니다)
		// != : not equel (같지 않다)

	}

}
