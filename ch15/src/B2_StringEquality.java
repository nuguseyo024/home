
public class B2_StringEquality
{
	public static void main(String[] args)
	{
		String str1 = new String("so simple");
		String str2 = new String("so simple");
		//스택에 있음   |     //힙에 있음 
		if(str1 == str2)
			System.out.println("str1, str2 참조 대상 동일하다.");
		else
			System.out.println("str1, str2 참조 대상 다르다.");
		
		
		if(str1.equals(str2))
			System.out.println("str1, str2 내용 동일하다.");
		else
			System.out.println("str1, str2 내용 다르다.");
		
	}

}
