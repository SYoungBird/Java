package day0311;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'A';
		System.out.println(c1);
		
		// char c2 = c1 + 1; => error
		
		char c3 = (char)(c1+1);
		System.out.println(c3);
		
		char c4 = ++c1;
		System.out.println(c4);
		
		int i = 'B'-'A';
		System.out.println(i);
		
		int j = '2'-'0';
		System.out.println(j);
		
	}

}
