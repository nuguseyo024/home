class BoxA3{
	private String conts;
	
	BoxA3(String cont){this.conts = cont;}
	public String getConts() {return conts;}
}
public class A3_BoxArray
{
	public static void main(String[] args)
	{
		BoxA3[] ar = new BoxA3[3];
		
		// 배열에 인스턴스 저장 (초기화)
		ar[0] = new BoxA3("First");
		ar[1] = new BoxA3("second");
		ar[2] = new BoxA3("Third");
		
		// 저장된 인스턴스의 참조
		System.out.println(ar[0].getConts());
		System.out.println(ar[1].getConts());
		System.out.println(ar[2].getConts());
	}

}
