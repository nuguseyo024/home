
public class C3_NullPointer
{

	public static void main(String[] args)
	{
		String str = null;
		System.out.println(str);		// null 출력
		int len = str.length();			// Exception !
		
		if(str != null)
			len = str.length();

	}

}
//뭔갈 넣어줘야 길이를 잴거아니야
//근데 아무것도 안넣었으니까 잴것도 없어서 에러가 나

