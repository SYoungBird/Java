package example;

import java.util.Scanner;

public class Nazalnan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int python = 60;
		int java = 70;
		int android = 80;
		int c = 50;
		int cpp= 30;
		
		int scoreSum = python + java + android + c + cpp;
		
		/*
		 *		sum = sum + a;
		 *		sum = sum + b;
		 *		sum = sum + c;
		 *		sum = sum + d;
		 *		sum = sum + e;
		 *		
		 */
		
		System.out.print("나잘난의 성적 총합계는" + scoreSum + " 입니다.  ");
		
		float scoreAvg = scoreSum/5.0f ; // int/float=float
		System.out.println("평균은 " + scoreAvg +" 입니다.");
		

	}

}
