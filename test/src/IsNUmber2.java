
public class IsNUmber2
{
	public static void main(String[] args)
	{
		String value ="123q531q";
		String ch = "";
		boolean isNumber = true;
		
		for(int i = 0; i<value.length(); i++)
		{
			ch = value.substring(i,i+1);
			System.out.println(ch);
			
			try {
				int num = Integer.parseInt(ch); //ch에 들어있는 요소들을 integer(숫자)로 바꿔라
			}catch(Exception e) 				//근데 그게 오류가 나면(숫자로 못바꾸는게 있으면
			{									//catch로 보내서 예외처리를 해라	
				isNumber = false;
				break; 
			}
		}
		if(isNumber) {System.out.println(value + " 는 숫자");}
		else {System.out.println(value + " 는 숫자가 아님");}

	}

}
