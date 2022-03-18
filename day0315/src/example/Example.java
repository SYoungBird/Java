package example;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int x=6, y=5;
		float z=4.0f;
		
		float vol = x*y*z; // int * int * float = float
		System.out.println("육면체의 부피는" + vol + "cm^3");
		
		//int a=2; 에서 a의 값이 짝수인지 홀수인지 판단하는 프로그램을 작성하시오.
		//int a=2;
		System.out.println("수를 입력하시오.");
		int a = sc.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println("짝수입니다.");
		}
		else
		{
			
			System.out.println("홀수입니다.");
		}
		
	}

}
