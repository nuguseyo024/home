
public class A3_CompString
{

	public static void main(String[] args)
	{
		String st1 = "A";
		String st2 = "B";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
		
		cmp = st1.compareTo(st2);
		
		if(cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if(cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + st1);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + st2);
		
		if(st1.compareToIgnoreCase(st2) == 0)
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
	}
}	
//==이면 "blahblah" 값을 비교하는게 아니라 id값을 비교하는거
//== 은 연산자고, 연산은 메모리-스택 영역에서 하는거

