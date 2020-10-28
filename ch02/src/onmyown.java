
public class onmyown
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to Java");
		System.out.println("First Java program");
		
		System.out.println("========================"); 
		
		System.out.println(7);
		System.out.println(3.15);
		System.out.println(3 + 5);
		System.out.println("3 + 5 =" + 8);
		System.out.println(3.15 + "는 실수입니다.");
		
		System.out.println("========================"); 
		
		int num1;
		num1 = 10;
		
		int num2 = 20;
		int num3 = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + num3);
		
		System.out.println("========================"); 
		
		double num4, num5;
		double result;
		num4 = 1.0000001;
		num5 = 2.0000001;
		result = num4 + num5;
		System.out.println(result);
		
		System.out.println("========================"); 
		
		double dnum = 1;
		for(int i=0; i<10000; i++) 
		{
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
		
		System.out.println("========================"); 
		
		char ch1 = '할';
		char ch2 = '확';
		char ch3 = 54736;
		char ch4 = 54869;
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;
		char ch7 = 'A';
		System.out.println(ch1 + "  "+ ch2);
		System.out.println(ch3 + "  "+ ch4);
		System.out.println(ch5 + "  "+ ch6);
		System.out.println(ch7 + " " + (char)(ch7 + 32));
		System.out.println(ch7 + 32);
		
		System.out.println("========================");
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);				
		
	}

}
