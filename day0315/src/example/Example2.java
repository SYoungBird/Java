package example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 값을 입력하시오.");

		int abs = sc.nextInt();
		
		if (abs>0)
		{
			System.out.println("절댓값은 "+abs+"입니다.");
		}
		else if (abs<0)
		{
			System.out.println("절댓값은 "+abs*(-1)+"입니다.");
		}
		else
		{
			System.out.println("0의 절댓값은 0입니다.");
		}
	}

}
