interface Animal1
{
	int DOG = 1;
	int CAT = 2;
}
interface Person1
{
	int MAN = 1;
	int WOMAN = 2;
}
public class A2_NonSafeConst
{

	public static void main(String[] args)
	{
		who(Person1.MAN);
		
		who(Animal1.DOG);
	}
	public static void who(int man)
	{
		switch(man)
		{
		case Person1.MAN:
			System.out.println("남성 손님입니다.");
			break;
		case Person1.WOMAN:
			System.out.println("여성 손님입니다.");
			break;
			
		}
	}
//컴파일 및 실행과정에서 오류가 발견되지 않음
}
