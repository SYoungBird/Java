package example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �Է��Ͻÿ�.");

		int abs = sc.nextInt();
		
		if (abs>0)
		{
			System.out.println("������ "+abs+"�Դϴ�.");
		}
		else if (abs<0)
		{
			System.out.println("������ "+abs*(-1)+"�Դϴ�.");
		}
		else
		{
			System.out.println("0�� ������ 0�Դϴ�.");
		}
	}

}