
public class IsNumber
{

	public static void main(String[] args)
	{
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i<value.length(); i++) 
		{
			ch = value.charAt(i);
			if((ch>='0' && ch<='9')){}
			//아스키 코드표 상에서 이 범위 안에 있으면 숫자
			else
			{
				isNumber = false;
				break;
			}
		}
		if(isNumber){System.out.println(value + " 는 숫자");}
		else {System.out.println(value + " 는 숫자가 아님");}
	}
}
//char 라서 아스키코드가 들어가욜