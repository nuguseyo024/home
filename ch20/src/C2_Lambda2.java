interface PrintableB{void print(String s);}


public class C2_Lambda2
{
	public static void main(String[] args)
	{
		PrintableB prn = new PrintableB()	// 익명 클래스
		{
			public void print(String s) {
				System.out.println(s);
			}
		}; //세미콜론!!!
		prn.print("What is Lambda? 2 ");
	}

}
