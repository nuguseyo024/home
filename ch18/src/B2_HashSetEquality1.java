import java.util.HashSet;

class Num1
{
	private int num;
	public Num1(int n) { num = n;}
	public String toString() {return hashCode() + " " + num;}
}
public class B2_HashSetEquality1
{
	public static void main(String[] args)
	{
		HashSet<Num1> set = new HashSet<>();
		set.add(new Num1(7799));
		set.add(new Num1(9966));
		set.add(new Num1(7799));
		
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Num1 n : set)
			System.out.println(n.toString() + '\t');
		System.out.println();
		
	}
}
