package chTest;

public class ChTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//'A'�� ASCII code�� ��ȯ
		char aVar='A';
		System.out.println("aVar : "+aVar);
		System.out.println("aVar : "+ (int)aVar);
		
		//�빮�� 'B'�� ASCII code�� ��ȯ
		char capb='B';
		System.out.println("capb : "+ (int)capb);
		
		//aVar�� �ҹ��� a�� ��ȯ
		int smaA =(int)aVar+32;
		char a = (char)smaA;
		System.out.println("A to "+a);
		
	
	}

}
