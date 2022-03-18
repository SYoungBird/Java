package example;

public class TypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a =12; 
			float b =13;
			float c = 0;
			c = (a+b)/2; 		//(12+13)/2 = 12.5
			System.out.println(c);
			
			float f = 12.5f;
			
			a = (int)f;
			System.out.println("a= " +a);
			
			char c1='A';
			char c2 = (char)(c1 + 1);
			System.out.println(c2);
			
			 

	}

}
