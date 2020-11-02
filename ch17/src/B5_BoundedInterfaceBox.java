interface Eatable
{ public String eat();}
class AppleB implements Eatable
{
	public String toString() {return "I am an apple.";}
	public String eat() {return "It tasets so good!";}
}
class BoxB<T extends Eatable>
{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() 
	{
		System.out.println(ob.eat()); 
		return ob;
	}
}
public class B5_BoundedInterfaceBox
{
	public static void main(String[] args)
	{
		BoxB<AppleB> box = new BoxB<>();
		box.set(new AppleB());
		
		AppleB ap = box.get();
		System.out.println(ap);
	}	
}
