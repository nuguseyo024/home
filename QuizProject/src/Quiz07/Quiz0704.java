package Quiz07;

public class Quiz0704
{

	public static void main(String[] args)
	{
		double fahr = Cel(1.0);
		System.out.println("화씨 : " + fahr);
		double cel = Fah(1.0);
		System.out.println("섭씨 : " + cel);
	}
	public static double Cel(double c)
	{
		return c*1.8 + 32;
	}
	public static double Fah(double f)
	{
		return (f-32)/1.8;
	}
}

//문제4
//섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
//화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
//화씨 = 1.8 * 섭씨 + 32
//섭씨 = (화씨 - 32) / 1.8
