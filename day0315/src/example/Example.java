package example;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int x=6, y=5;
		float z=4.0f;
		
		float vol = x*y*z; // int * int * float = float
		System.out.println("����ü�� ���Ǵ�" + vol + "cm^3");
		
		//int a=2; ���� a�� ���� ¦������ Ȧ������ �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//int a=2;
		System.out.println("���� �Է��Ͻÿ�.");
		int a = sc.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println("¦���Դϴ�.");
		}
		else
		{
			
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}

}
