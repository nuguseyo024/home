enum Scale1{DO, RE, MI, FA, SO, RA, TI}
public class A3_SimpleEnum
{
	public static void main(String[] args)
	{
		Scale1 sc = Scale1.DO;
		System.out.println(sc);
		
		switch(sc) 
		{
		case DO:
			System.out.println("도 ~");
			break;
		case RE:
			System.out.println("레 ~~");
			break;
		case MI:
			System.out.println("미~~");
			break;
		case FA:
			System.out.println("파~ ~");
			break;
		default:
			System.out.println("솔~ 라~~ 시~~~");
		
		}
	}//case문에서는 표현의 간결함을 위해 Do와 같이 '열거형 값'의 이름만 명시하기로 약속되어 있다.
}
