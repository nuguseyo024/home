interface PrintableD {void print(String s);}
					// 매개변수 하나, 반환형 void
public class E1_OneParamNoReturn
{
	public static void main(String[] args)
	{
		PrintableD p;
		
		p = (String s) -> {System.out.println(s);};
		// 줄임 없는 표현
		p.print("Lambda exp one.");
		
		p = (String s) -> System.out.println(s);
		// 중괄호{} 생략
		p.print("Lambda exp two.");
		
		p = (s) -> System.out.println(s);
		// 매개변수 형String 생략
		p.print("Lambda exp three.");
		
		p = s -> System.out.println(s);
		// 매개변수String , 소괄호() 생략
		p.print("Lambda exp four.");
	}
}
