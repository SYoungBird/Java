package example;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc = new Scanner(System.in); // 화면의 정보를 받아감. (암기할것) //받아간 정보를 메모리에 저장.
		System.out.println("성별을 입력하세요");
		int gender = sc.nextInt(); //11 에서 12 라인이 실행될 때 gender에 대한 값을 유저에게서 받아감.
		
		//int gender = 2; //3, 4
		
		//gender가 3인 경우 "남자"로 출력
		//gender가 4인 경우 "여자"로 출력
		
		if (gender % 2 == 0 && gender <5) 
		{
			System.out.println("여자");
		}
		
		else if (gender % 1 == 0 && gender <5)
		{
			System.out.println("남자");
		}
		
		else
		{	
			System.out.println("잘못입력.");
		}
		
		/*
		 * point가 68이다.
		 * point가 60이상이면 합격을 출력하고.
		 * 그렇지 않으면 불합격을 출력하시오.
		 * 
		 */
		System.out.println("점수를 입력하세요");
		int point = sc.nextInt();
		
		if (point>=60 && point <=100)
		{
			System.out.println("합격");
		}
		else if (point >= 0)
		{
			System.out.println("불합격");
		}
		else
		{
			System.out.println("잘못된 점수 입력");
		}
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		if (score >=90) //90-100
		{
			System.out.println("수");
		}
		else if (score >=80)
		{
			System.out.println("우");
		}
		else if (score >=70)
		{
			System.out.println("미");
		}
		else if (score >=60)
		{
			System.out.println("양");
		}
		else
		{
			System.out.println("가");
		}
	}

}
