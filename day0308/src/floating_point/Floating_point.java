package floating_point;

public class Floating_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float y = 3.14f;
		
		System.out.println("y="+y);
		//printf() // ����ȭ�� ���
		System.out.printf("floating-point:%.8f\n", y);//�Ǽ��� �Ҽ��� 8�ڸ�����//�Ҽ��� 9° �ڸ����� �ݿø�
		System.out.printf("floating-point:%020.8f\n", y);//�� 20�ڸ�, �Ҽ��� �Ʒ� 8�ڸ� ����. �������� 0���� ä��.
		System.out.printf("floating-point:%20.8f\n", y);//�� 20�ڸ�, �Ҽ��� �Ʒ� 8�ڸ� ����.
		System.out.printf("floating-point:%.8g\n", y);
		System.out.printf("floating-point:%.8e\n", y);//����ǥ������
		
		System.out.printf("%d \n", 10); //%d : 10�� ������ ���(decimal)
		System.out.printf("%o \n", 10); //%o : 8�� ������ ���
		System.out.printf("%x \n", 10); //%x : 16�� ������ ���
		System.out.printf("d");

	}

}
