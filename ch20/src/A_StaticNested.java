class Outer1
{
	private static int num = 0;
	static class Nested1
	{
		void add(int n) {num += n;}
	}
	static class Nested2
	{
		int get() {return num;}
	}
}

public class A_StaticNested
{
	public static void main(String[] args)
	{
		Outer1.Nested1 nst1 = new Outer1.Nested1();
		nst1.add(5);
		
		Outer1.Nested2 nst2 = new Outer1.Nested2();
		System.out.println(nst2.get());
	}
}

// 먼소리지

/*
 class Outer
 {
 	class MemberInner{...}  <---멤버클래스
 
 	void method()
 	{
 		class  LocalInner{...} <--- 로컬 클래스
 	}
 }
 */