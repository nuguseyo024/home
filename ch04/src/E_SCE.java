
public class E_SCE
{

	public static void main(String[] args)
	{
		
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result + " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		// num1의 계산만으로 true/false 판별이 가능해져서 num2는 계산을 안하는 것
		// 그게 아래 계산까지 내려와서 num2는 0이 되고 num1만 제대로 계산한 20이 됨
	}

}

// SCE : Short- Circuit Evaluation
//     : 최단거리 연산 - 효율성을 위해 뒤 쪽은 계산을 하지 않는다.
// 참 && 참 --> 참 : 앞쪽이 거짓이면 뒤쪽 계산은 필요하지 않다.
// 참 || 거짓 --> 참 : 앞쪽이 참이면 뒤쪽 계산은 필요하지 않다.
