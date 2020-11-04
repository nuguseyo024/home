interface HowLong { int len(String s); }
					// 값을 반환하는 메소드
public class E4_OneParamAndReturn
{
	public static void main(String[] args)
	{
		HowLong hl = s -> s.length();
		
		int num = hl.len("I am so happy"); // 이와 같이 연산 결과가 남는다.
		System.out.println(num);
		
		System.out.println(hl.len("I an so happy"));
	}

}
