// 문자열 생성 방법 두 가지의 차이점
// 인스턴스의 참조 값 비교
public class A2_ImmutableString
{

	public static void main(String[] args)
	{
		String str1 = "simple string";
		String str2 = "simple string";
		//Stirng str2 = str1;
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		// 인스턴스의 참조 값 비교
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		if(str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		//str3과 str4는 new로 만들어서 새로운 값을 찍어서 저장했기 때문에 다른 id로 저장된다
	}

}
