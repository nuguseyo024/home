
public class B_CompAssign0p
{

	public static void main(String[] args)
	{
		short num = 10;
		num = (short)(num + 77l); // 형 변환 안하면 컴파일 오류 발생
		
		int rate = 3;
		rate = (int)(rate * 3.5); // 형 변환 안하면 컴파일 오류 발생
		
		System.out.println(num);
		System.out.println(rate);
		
		
		// 복합대입 연산자 -> 계산해야할 식이 무쟈게 많으면 효율적인 방식이지만... 
		// 그게 아니라면 굳이 사용? 안함
		num = 10;
		num += 77l; // 형 변환 필요하지 X
		
		rate = 3;
		rate *= 3.5; // 형 변환 필요하지 X
		
		System.out.println(num);
		System.out.println(rate);
		
		

	}

}
