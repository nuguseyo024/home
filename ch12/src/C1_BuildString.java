
public class C1_BuildString
{

	public static void main(String[] args)
	{
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678); //45678 을 뒤에 붙여줌
		System.out.println(stbuf.toString());
		
		stbuf.delete(0,2); //0이상 2미만 까지 delete
		System.out.println(stbuf.toString());
		
		stbuf.replace(0,3,"AB"); //0이상 3미만 까지 지워버리고 "AB"로 replace
		System.out.println(stbuf.toString());
		
		stbuf.reverse(); // 순서를 반전
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2,4); // 2보다 같거나 크ㅡ고 4보다 작다
		System.out.println(sub);
	}

}