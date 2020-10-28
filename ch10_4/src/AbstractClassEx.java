abstract class Animal
{
	int age; //추상클래스에는 int 도 쓸 수 있삼
	abstract void cry();//구현이 안돼있잖아 --> 추상메소드!
}
//나를 상속받는 애는 이거(abstract~~)는 꼭 해야한다
//cry에는 구현할게 없어서 상속받는 애들이 해줘야함 
//(그래서 추상클래스는 new로 표현을 못함)

class Dog extends Animal
{
	void cry()
	{
		System.out.println("멍멍");
	}
}
class Cat extends Animal
{
	void cry() 
	{
		System.out.println("야옹");
	}
}
public class AbstractClassEx
{

	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
	}

}