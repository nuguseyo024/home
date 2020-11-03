interface Printable3
{
	void print();
}
class Papers3
{
	private String con;
	public Papers3(String s) {con = s;}
	public Printable3 getPrinter() 
	{
		return new Printable3()
		{
			public void print() {System.out.println(con);}
		};
	}	
}
class B4_UseAnonumousInner
{
	public static void main(String[] args, Object sff)
	{
		Papers3 p = new Papers3("서류 내용 : 행복합니다?");
		Printable3 prn = p.getPrinter();
		prn.print();
	}
}