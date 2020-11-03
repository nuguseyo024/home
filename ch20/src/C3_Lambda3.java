interface PrintableC {void print(String s);}
//메서드가 하나밖에 없으면 굳이 뭘 만들 필요 없이 저 메서드만 구현해주만 된다
//파라미터 자리에다가 하나 만들어주고 람다표시해주면 된다고


public class C3_Lambda3
{
	public static void main(String[] args)
	{
		PrintableC prn = (s) -> {System.out.println(s);};
		prn.print("What is Lambda? 3");
	}

}
//메서드만 쓰고싶은거야 객체를 만들게 아니니까 new 하지 말자고요
//이름이 없는데 그냥 넣어준거니까 빼주고
//메서드만 살리고 싶은거야
//람다함수다 이 표시로 화살표를 찍는다
//자바에서는 추론할 수 있으면 굳이 안쓴다 (String s)에서 파라미터 String도 빼준다

//함수형 인터페이스라는 의미
//여러개의 메서드를 선언하면 에러남~~