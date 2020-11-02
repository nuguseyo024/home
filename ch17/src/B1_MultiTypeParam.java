class Box7<L, R>
{
	private L left;
	private R right;
	
	public void set(L o, R r)
	{
		left = o;
		right = r;
	}
	public String toString() {return left + " & " + right;}
}
public class B1_MultiTypeParam
{
	public static void main(String[] args)
	{
		Box7<String, Integer> box = new Box7<String,Integer>();
		box.set("Apple", 25);
		System.out.println(box);
	}
}

