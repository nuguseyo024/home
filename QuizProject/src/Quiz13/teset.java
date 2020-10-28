package Quiz13;
import java.util.Scanner;
public class teset
{
	public static void main(String[] args) {
		
		// 5명의 학생 신장을 입력받아 평균, 최대값 최소값 구하기.
		String[] name = {"James", "Cathy", "Kenny", "Martln", "Crystal","jin"};
		int[] cm = new int[6];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0 ; i < name.length ; i++) {
			System.out.print(name[i] + " 의 신장을 입력하세요! : ");
			cm[i] = scan.nextInt();
		}
		
		int cm_sum = 0;
		double cm_aver = 0;
		int cm_max = 0;
		int cm_min = 0;
		
		for (int i = 0 ; i < cm.length ; i++) {
			cm_sum = cm_sum + cm[i];
			
			if (cm[cm_max] < cm[i])
				cm_max = i;
			if (cm[cm_min] > cm[i])
				cm_min = i;
		}		
		cm_aver = (double)cm_sum / cm.length;	

	
		System.out.println("평균 신장은 : " + String.format("%.2f", cm_aver) + "cm");
		System.out.println("가장 큰 학생은 " + name[cm_max] + " 이고 그 학생의 키는 " + cm[cm_max] + " 이다.");
		System.out.println("가장 작은 학생은 " + name[cm_min] + " 이고 그 학생의 키는 " + cm[cm_min] + " 이다.");
			
	}
}
