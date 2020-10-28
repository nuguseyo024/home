abstract class Animal
{
	abstract void print();
}
class Cat extends Animal
{
	void print()
	{System.out.println("고양이 생성");}
}
class Dog extends Animal 
{
	void print()
	{System.out.println("강아지 생성");}
}
public class Polymorphism2
{
	public static void animalUse(Animal obj)
	//뭐가 들어올지 모르기 때문에 일단 포괄적인 부모변수를 넣어놓음
	{
		if(obj instanceof Cat)//넣어놓은 부모변수를 Cat 변수로 바꾸는 과정
		{
			Cat c = (Cat)obj;//부모변수가 어떤 형태인지 모르기 때문에 Cat의 형태로 형변환을 해줌
			c.print();
		}
		else
		{
			Dog d = (Dog)obj;
			d.print();
		}
	}
	public static void main(String[] args)
	{
		Cat h1 = new Cat();
		animalUse(h1);
		
		Dog h2 = new Dog();
		animalUse(h2);
	}

}
