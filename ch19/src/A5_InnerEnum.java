class Customer 
{
	enum Gender { MALE, FEMALE }
	//이렇게 안에다 정의하면 다른 클래스가 못써요	
	private String name;
	private Gender gen;
	
	Customer(String n , String g)
	{
		name = n;
		
		if(g.equals("man"))
			gen = Gender.MALE;
		else
			gen = Gender.FEMALE;
	}
	public String toString() 
	{
		if(gen == Gender.MALE)
			return "Thank you, Mr " + name;
		else
			return "Thank you, Ms " + name;
	}
}
class A5_InnerEnum
{
	public static void main(String[] args)
	{
		Customer cus1 = new Customer("BROWN", "man");
		Customer cus2 = new Customer("SUsan Hill", "woman");
		
		System.out.println(cus1);
		System.out.println(cus2);
	}

}
