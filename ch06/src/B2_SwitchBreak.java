
public class B2_SwitchBreak
{

	public static void main(String[] args)
	{
		int n = 1;
		
		switch(n) 
		{
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3 :
			System.out.println("Fanstastic Java");
			break;
		default:
			System.out.println("The best programming language");
		}
		System.out.println("Do you like Java?");
	}
}
/*         switch + break 구성의 다른 예

switch(n) 
{
	case 1:
	case 2:
	case 3:
		System.out.println("case 1, 2, 3");
		break;
	default:
		System.out.println("default");
}
*/
