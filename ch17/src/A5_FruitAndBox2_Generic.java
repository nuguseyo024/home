class Apple5
{
	public String toString() {return "I am an apple.";}
}
class Orange5
{
	public String toString() {return "I am an orange.";}
}
class Box5<T>
{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}

public class A5_FruitAndBox2_Generic
{
	public static void main(String[] args)
	{	
		Box5 <Apple5> aBox = new Box5<Apple5>();
		Box5 <Orange5> oBox = new Box5<Orange5>();
		//Box5<T> 자리에  Apple5를 넣어서 다 바꾼다음에 뽑아냄
		
		
		aBox.set(new Apple5());
		oBox.set(new Orange5());
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
		
	}

}
