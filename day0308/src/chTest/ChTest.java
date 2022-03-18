package chTest;

public class ChTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//'A'를 ASCII code로 변환
		char aVar='A';
		System.out.println("aVar : "+aVar);
		System.out.println("aVar : "+ (int)aVar);
		
		//대문자 'B'를 ASCII code로 변환
		char capb='B';
		System.out.println("capb : "+ (int)capb);
		
		//aVar을 소문자 a로 변환
		int smaA =(int)aVar+32;
		char a = (char)smaA;
		System.out.println("A to "+a);
		
	
	}

}
