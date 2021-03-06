import java.util.StringTokenizer;
public class C2_StringToken
{

	public static void main(String[] args)
	{
		StringTokenizer v = new StringTokenizer("a b c");
		StringTokenizer n = new StringTokenizer("1 2 3");
		
		String s = v.nextToken();
		int num = Integer.parseInt(n.nextToken());
		int sum = num;
		
		while(v.hasMoreTokens())
		{
			s = s + " + " + (v.nextToken());
			sum = sum + Integer.parseInt(n.nextToken());
		}
		System.out.println(s + " = " + sum);
		
		System.out.println("================================");
		
		String str1 = "홍길동,20,010-1234-5678,\"종로구, 관철동\"";
		str1 = str1.replaceAll(", " , " " ); // 모든 ' , ' 를 지워버리고 띄어쓰기로 대체하기
		str1 = str1.replaceAll("\"",""); // 모든 '\"'을 지워버리기 ("" 안에 아무것도 안넣었으니까)
		
		StringTokenizer st = new StringTokenizer(str1, ",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}

//두번째 자리에 "" 뭐가 없으면 띄어쓰기를 디폴트로 나눠줌