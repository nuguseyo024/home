
public class A_FormatString
{

	public static void main(String[] args)
	{
		int age = 20;
		double height = 178.2;
		String name = "Hong Gil Dong";
		System.out.printf("name : %s \n", name);
		System.out.printf("age : %d \n height : %e \n\n", age, height);
		
		System.out.printf("%d - %o - %x \n\n", 77, 77, 77);
		System.out.printf("%g \n", 0.00014);
		System.out.printf("%g \n", 0.000014);
	}

}
// 찍을게 많아지면 printf가 편합니다 
// println같은건 ""찍다가 틀릴 우려