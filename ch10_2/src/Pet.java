class Animal
{
	String name;
	int age;
	
	void printPet()
	{
		System.out.println("이 름 : " + name);
		System.out.println("나 이 : " + age);
	}
}

class Cat extends Animal //Cat은 Animal에 있는걸 맘대로 씁니다
{
	String variety;
	
	void printPet()
	{
		super.printPet(); //부모세대의 printPet을 불러옴
		System.out.println("종 류 :" + variety);
	}
}
class Pet
{
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		cat.name = "양순이";
		cat.age = 5;
		cat.variety = "페르시안";
		cat.printPet(); //부모+자식 다 print 해라
	}
}