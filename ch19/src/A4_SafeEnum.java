enum Anumal2 {DOG, CAT}
enum Person2 {MAN, WOMAN}
public class A4_SafeEnum
{

	public static void main(String[] args)
	{
		who(Person2.MAN);
		
		// who(Animal2.DOG);  //컴파일 과정에서 자료형 불일치로 인한 오류 발생
	}
	public static void who(Person2 man)
	{
		switch(man)
		{
		case MAN:
			System.out.println("남성 손님입니다.");
			break;
		case WOMAN:
			System.out.println("여성 손님입니다.");
			break;
			
		}
	}
//컴파일 및 실행과정에서 오류가 발견되지 않음
}
