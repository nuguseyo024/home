
public class MyTest
{

	public static void main(String[] args)
	{
		getScore(1);
		System.out.println("졸려" );
	}
	public static int getScore(int n1)
	{
		if(n1 > 0)
			return 100;
		return 0;//이게 없으면 위에 if에서 return이 안나오는 상황이 있을수 있어서(ex. n1 = -12312) 오류발생
	}
	
	

}
