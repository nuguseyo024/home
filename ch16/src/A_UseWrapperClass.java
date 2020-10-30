
public class A_UseWrapperClass
{

	public static void main(String[] args)
	{
		String a = "34";				//"34" 라는 String을 Int로 변환하는 메서드.
		int b = 50;						// 랩퍼 클래스에서 기본으로 장착하고 있어 
		int c = Integer.parseInt(a); 	// 따로 메서드를 작성할 필요가 없다
		int d = c + b;				 
	 
		System.out.println(a+ " + " + b + " = " + d );
	}
}
