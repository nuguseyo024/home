package step07;

public class PhoneInfo implements java.io.Serializable
{								 // 이게 없으면 저장을 못해요
	String name;
	String phoneNumber;
	String email;
	
	public PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public PhoneInfo(String name, String phoneNumber, String email)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	//오버로딩 구현
	
	public void showPhoneInfo()
	{
		System.out.println("Name : " + name);
		System.out.println("PhoneNumber : " + phoneNumber);
		if(email != null&& !email.equals(""))
			System.out.println("Email : " + email);
		
	}
	
	//출력만 하는 메소드
	//이메일이 널이나 공백이 아니면 얘를 출력
	//--> 널보다 이퀄스를 먼저찍으면 에러남 널에서 내용이 있는지 없는지를 먼저 봐줘야함
}
