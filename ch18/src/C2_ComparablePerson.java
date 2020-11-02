import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
	private String name;
	private int age;
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	public String toString() 
	{
		return name + " : " + age;
	}
	public int comparableTo(Person p) 
	{
		// return this.age - p.age; 
		return p.age - this.age;
	}	
	public int compareTo(Person p)
	{
//		return this.age - p.age;
//		return p.age - this.age;
//		return this.name.compareTo(p.name);
		return p.name.compareTo(this.name);
	}
}
public class C2_ComparablePerson
{
	public static void main(String[] args)
	{
		Set<Person> tree = new TreeSet<>();
		tree.add(new Person("SON", 37));
		tree.add(new Person("HONG", 55));
		tree.add(new Person("JEON", 22));
		
		for(Person p : tree)
			System.out.println(p);
	}

}
