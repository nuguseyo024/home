import java.util.Random;

//인스턴스 생성과 관계 없이 static 변수가 메모리 공간에 할당될 때 실행이 된다.
public class StaticEx2
{
	static int num;
	
	static
	{
		Random rand = new Random();
		num = rand.nextInt(100);
	}
	public static void main(String[] args)
	{
		System.out.println(num);
	}
}
