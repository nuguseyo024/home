class 사람
{
	String 이름;
	int 나이;
	int 키;
	
	void 인사() 
	{
		System.out.println("안녕하세요.");
	}
}
class MyWorld
{
	public static void main(String[] args) 
	{
		//'사람'이란 설계도(class)를 이용해 사람(객체) 만들기
		//실제 사람이 태어나면 --> 지구에 삶
		// 객체'사람'이 만들어지면 --> 메모리에 적재가 됨
		사람 man1 = new 사람();
		man1.이름 = "홍길동";
		man1.나이 = 20;
		man1.키 = 170;
		
		man1.인사();
		System.out.println(man1.이름);
	}
}