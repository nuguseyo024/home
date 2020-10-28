interface Greet
{
	void greet();
}
interface Bye extends Greet
{
	void bye();//구현하는 순간 메소드가 되어버림 (interface/abstract는 구현 못해)
}
class Greeting implements Bye
{
	public void greet()
	{
		System.out.println("hi");
	}
	public void bye() 
	{
		System.out.println("bye");
	}
}
class Meet
{

	public static void main(String[] args)
	{
		Greeting greeting = new Greeting();
		greeting.greet();
		greeting.bye();
	}

}
//상속과 인터페이스를 같이 쓰는 경우 extends를 먼저 쓰고 implements를 쓴다