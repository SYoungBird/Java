package example;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc = new Scanner(System.in); // ȭ���� ������ �޾ư�. (�ϱ��Ұ�) //�޾ư� ������ �޸𸮿� ����.
		System.out.println("������ �Է��ϼ���");
		int gender = sc.nextInt(); //11 ���� 12 ������ ����� �� gender�� ���� ���� �������Լ� �޾ư�.
		
		//int gender = 2; //3, 4
		
		//gender�� 3�� ��� "����"�� ���
		//gender�� 4�� ��� "����"�� ���
		
		if (gender % 2 == 0 && gender <5) 
		{
			System.out.println("����");
		}
		
		else if (gender % 1 == 0 && gender <5)
		{
			System.out.println("����");
		}
		
		else
		{	
			System.out.println("�߸��Է�.");
		}
		
		/*
		 * point�� 68�̴�.
		 * point�� 60�̻��̸� �հ��� ����ϰ�.
		 * �׷��� ������ ���հ��� ����Ͻÿ�.
		 * 
		 */
		System.out.println("������ �Է��ϼ���");
		int point = sc.nextInt();
		
		if (point>=60 && point <=100)
		{
			System.out.println("�հ�");
		}
		else if (point >= 0)
		{
			System.out.println("���հ�");
		}
		else
		{
			System.out.println("�߸��� ���� �Է�");
		}
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		
		if (score >=90) //90-100
		{
			System.out.println("��");
		}
		else if (score >=80)
		{
			System.out.println("��");
		}
		else if (score >=70)
		{
			System.out.println("��");
		}
		else if (score >=60)
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("��");
		}
	}

}