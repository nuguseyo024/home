
public class G_InfRecul
{

	public static void main(String[] args)
	{
		showHi(3);
	}
	public static void showHi(int cnt) 
	{
		System.out.println("Hi~~ " + cnt);
		if(cnt ==1)
			return;
//		showHi(cnt--); 무한호출!
		showHi(--cnt);
	}

}
