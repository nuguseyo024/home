import java.util.Scanner;

public class B1_ScanningString
{

	public static void main(String[] args)
	{
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
		//System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
		sc.close();
	}

}

// Scanner 클래스의 인스턴스 생성은 데이터를 뽑아 올 대상과의 연결을 의미한다.
// 연결 후에는 데이터 스캔 가능!
