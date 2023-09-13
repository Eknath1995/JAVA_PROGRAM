package practice;

public class pen{
	int a;
	int b;
	
	pen(int ab, int bc){
		this.a=ab;
		this.b=bc;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		pen p= new pen(10,20);
		
		
	}
}
