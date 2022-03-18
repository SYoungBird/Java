package example;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i=5, j=5;
			System.out.println(i++); //System.out.println(i); (후위형)
									     //i=i+1;
			System.out.println(++i); //7이 출력됨 (전위형)
			
			System.out.println(j--); //System.out.println(j);
										 //j=j-1;
			System.out.println(--j); //3이 출력됨
			
			System.out.println("i =" + i + ", j =" + j ); //i =6, j =4
			
			int capM= 'M';
			capM++;
			System.out.println((char)capM);
			
			
	}

}
