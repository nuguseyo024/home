class Apple3
{
	public String toString() {return "I am an apple.";}
}
class Orange3
{
	public String toString() {return "I am an orange.";}
}
class Box3
{
	private Object ob;
	public void set(Object o) {ob = o;}
	public Object get() {return ob;}
}

public class A3_FruitAndBoxFault
{
	public static void main(String[] args)
	{	
		Box3 aBox = new Box3();
		Box3 oBox = new Box3();
		
		aBox.set("Apple");
		oBox.set("Orange");
		
		Apple3 ap = (Apple3)aBox.get();
		Orange3 og = (Orange3)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
		
	}

}

//new Apple2()  new Orange2() 일케 담았어야 됐는데
//문자열을 그대로 담아버림
//컴파일 과정에선 오류가 발견되지 않음 --> 꺼냈을때 오류발생
