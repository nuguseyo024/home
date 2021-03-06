package Quiz13;

import java.util.Scanner;

public class Quiz13_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		int[][] nScore = new int[4][4];
		int[] nScoreSum = new int[4];
		
		// 국어 nScore[0][0~3]
		// 영어 nScore[1][0~3]
		// 수학 nScore[2][0~3]
		// 국사 nScore[3][0~3]
		
		for(int i = 0; i<4; i++) 
		{
			if     (i == 0) System.out.print("국어 점수 입력 : " + "\t");
			else if(i == 1) System.out.print("영어 점수 입력 : " + "\t");
			else if(i == 2) System.out.print("수학 점수 입력 : " + "\t");
			else    		System.out.print("국사 점수 입력 : " + "\t");
			
			for(int j = 0; j<nScore[i].length; j++) 
				nScore[i][j] = sc.nextInt();
		}
		String[] sKind = {"구분", "이순신", "강감찬", "을지문", "권율", "총점"};
		for(int i = 0; i<6; i++) 
		{
			System.out.print(sKind[i] + "\t");
		}
		System.out.println();
		
		for(int j = 0; j<4; j++) 
		{
			int nSum = 0;
			for(int i = 0; i<4; i++)
			{
				nSum = nSum + nScore[i][j];
			}
			nScoreSum[j] = nSum;
			System.out.print(nSum+ "\t");
			System.out.println();
		}
		
		for(int i = 0; i<nScore.length; i++) 
		{
			int nSum = 0;
			for(int j = 0; j<nScore[i].length; j++)
			{
				System.out.print(nScore[i][j] + "\t");
				nSum = nSum + nScore[i][j];
			}
			System.out.print(nSum+ "\t");
			System.out.println();
		}
		System.out.print("총 : \t");
		for(int i = 0; i<4; i++) 
			System.out.print(nScoreSum[i] + "\t");
		System.out.println();
	}
	
}
//문제8
//성적관리 프로그램을 작성한다. 국어, 영어, 수학, 국사 4과목이고 
//학생은 이순신, 강감찬, 을지문덕, 권율 4명이다.
//4 by 4 배열을  선언하고 
//사용자로부터 4사람의 4과목 점수를 입력받아 
//다음의 형태로 값을 저장하고 출력
