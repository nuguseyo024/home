
public class B3_IndexOf
{

	public static void main(String[] args)
	{
		String st1 = "AppleBananaOrange";
		int num1 = st1.indexOf("B"); //B가 위치하고 있는 순서값
		int num2 =st1.indexOf("O"); //O가 위치하고 있는 순서값
		
		String st2 = st1.substring(num1,num2); //B자리의 숫자부터(이상) O자리의 숫자까지(미만)
		System.out.println(st2);
	}

}
