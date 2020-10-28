
public class H_Postfix0p
{

	public static void main(String[] args)
	{
		int num = 5;
		System.out.print((num++) + "  ");	// 5를 출력하고, 그 후에 값이 하나 증가
		System.out.print((num++) + "  ");	// 위에서 증가된 값(6)을 출력하고, 값이 증가
		System.out.print(num + "\n");		// 위에서 증가된 값(7)을 출력
		
		System.out.print((num--) + "  ");	// 위에서 증가된 값(7)을 출력하고, 값이 감소
		System.out.print((num--) + "  ");	// 위에서 감소된 값(6)을 출력하고, 값이 감소
		System.out.print(num);				// 위에서 감소된 값(5)을 출력

	}

}
