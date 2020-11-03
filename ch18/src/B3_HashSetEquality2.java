import java.util.HashSet;

class Num2
{
	private int num;
	public Num2(int n) {num = n;}
	public String toString() {return hashCode() + " " + num;}
	public int hashCode() {return num % 3;}
	public boolean equals(Object obj)
	{
		if(num == ((Num2)obj).num)
			return true;
		else
			return false;
	}
}
public class B3_HashSetEquality2
{
	public static void main(String[] args)
	{
		HashSet<Num2> set = new HashSet<>();
		set.add(new Num2(7799));
		set.add(new Num2(9966));
		set.add(new Num2(7799));
		
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Num2 n : set)
			System.out.println(n.toString() + '\t');
		System.out.println();
		
	}
}
