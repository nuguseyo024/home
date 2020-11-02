import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>
{
	private String name;
	int age;
	
	public Person2(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	public String toString() 
	{
		return name + " : " + age;
	}
	public int compareTo(Person2 p)
	{
		return this.age - p.age;
	}
}
class PersonComparator implements Comparator<Person2>
{
	public int compare(Person2 p1, Person2 p2) 
	{
		return p2.age - p1.age;
	}
}
//class PersonComparator implements Comparator<Person2>
//{
//	public int compare(Person2 p1, Person2 p2)
//	{
//		//return p2.age - p1.age;
//		return p1.name.compareTo(p2.name);
//	}
//} 이와 같이 변경해서 사용도 가능
public class C3_ComparatorPerson
{
	public static void main(String[] args)
	{
		Set<Person2> tree = new TreeSet<>(new PersonComparator());
		tree.add(new Person2("YOON", 37));
		tree.add(new Person2("HONG", 55));
		tree.add(new Person2("홍길동", 22));
		tree.add(new Person2("PARK", 22));
		
		for(Person2 p : tree)
			System.out.println(p);
	}
}
