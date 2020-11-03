interface Printable2{void print();}
class Papers2
{
	private String con;
	public Papers2(String s) {con = s;}
	public Printable2 getPrinter() 
	{
		class Printer2 implements Printable2
		{
			public void print() {System.out.println(con);}
			// 로컬 클래스 : 메서드 안으로 더 깊이 감춰놨다~
		}
		return new Printer2();
	}
	private class Printer2 implements Printable2
	{
		public void print() {System.out.println(con);}
	}
}
class B3_UseLocalInner
{
	public static void main(String[] args)
	{
		Papers2 p = new Papers2("서류 내용 : 행복합니다?");
		Printable2 prn = p.getPrinter();
		prn.print();
	}
}

