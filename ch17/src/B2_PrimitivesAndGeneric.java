class Box8<T>
{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
public class B2_PrimitivesAndGeneric
{
	public static void main(String[] args)
	{
		Box8<Integer> iBox = new Box8<Integer>();
		// Box<int> box = new Box<int>(); 이런 식으로 못씀
		
		iBox.set(125);			// 오토 박싱
		int num = iBox.get();	// 오토 언박싱
		
		System.out.println(num);
	}

}
