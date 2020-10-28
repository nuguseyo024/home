
public class A3__Cond0p
{

	public static void main(String[] args)
	{
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("두 수의 차 : " + diff);

	}

}

// 조건(true or false) ? 값1(true 시 반환) : 값2(false 시 반환)
