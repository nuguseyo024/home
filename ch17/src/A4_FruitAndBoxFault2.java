class Apple4
{
	public String toString() {return "I am an apple.";}
}
class Orange4
{
	public String toString() {return "I am an orange.";}
}
class Box4
{
	private Object ob;
	public void set(Object o) {ob = o;}
	public Object get() {return ob;}
}

public class A4_FruitAndBoxFault2
{
	public static void main(String[] args)
	{	
		Box4 aBox = new Box4();
		Box4 oBox = new Box4();
		
		aBox.set("Apple");
		oBox.set("Orange");
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
		
	}

}
//오류는 안나지만 애초에 사과/오렌지 를 담은 것이 아닌
//"사과""오렌지" 라는 문자열을 담아서 꺼냈기 때문에
//처음부터 잘못된 코드