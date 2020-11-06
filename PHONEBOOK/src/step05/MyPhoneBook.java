package step05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBook
{
	static Scanner sc = new Scanner(System.in);
	static Map<String, PhoneInfo> map = new HashMap<>();
	
	public static void showMenu()
	{
		System.out.println("==========================================");
		System.out.println("[ 메뉴 선택 ]");
		System.out.println("1. 저놔번호 입력");
		System.out.println("2. 전화번호 조회");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 종료");
		System.out.print(">> 선택 : ");
	}
	
	public static void addNumber() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.println("==========================================");
		
		PhoneInfo pInfo;
		if(email != null && !email.equals(""))
			pInfo = new PhoneInfo(name, phoneNumber, email);
		else
			pInfo = new PhoneInfo(name, phoneNumber);
		pInfo.showPhoneInfo();
		map.put(name, pInfo);
		System.out.println("맵의 크기 : " + map.size());
	}
	public static void selNumber() {
		System.out.println("==========================================");
		System.out.print("조회할 이름 입력 : ");
		String name = sc.nextLine();
		
		
		PhoneInfo pInfo = map.get(name);
			
		if(pInfo != null)
			pInfo.showPhoneInfo();
		else
			System.out.println("[" + name + "] 데이터가 없습니다.");
		
	}
	public static void delNumber() {
		System.out.println("==========================================");
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.nextLine();
		
		PhoneInfo pInfo = map.remove(name);
		if(pInfo != null)
		{System.out.println("[" + name + "] 데이터를 삭제하였습니다.");}
		else
			System.out.println("해당 값이 없습니다. - " + name);
		
		Set<String> ks = map.keySet();  //디버그용
		for(String s : ks)
			System.out.println(s + " : " + map.get(s).toString()); //형변환?
		System.out.println("==========================================");
		
		System.out.println("저장된 연락처 수 : " + map.size());
	}
	
	public static void main(String[] args)
	{
		int choice;
		while(true)
		{
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				addNumber();
				break;
			case 2:
				selNumber();
				break;
			case 3:
				delNumber();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

} 
