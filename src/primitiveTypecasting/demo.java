package primitiveTypecasting;

public class demo {
	public static void main(String[] args) {
		//primitive data type casting
		
		System.out.println("----widening----");
		
		int a=10;
		double b=a;
		System.out.println(a+" "+ b); //10 , 10.0
		
		char c='A';
		int d=c;
		System.out.println(c+" "+d);  //A , 65
		
		System.out.println();
		
		System.out.println("----narrowing----");
		
		double x=3.14;
		int y=(int)x;
		System.out.println(x+" "+y);  // 3.14 , 3
		
		int i=66;
		char j=(char)i;
		System.out.println(i+" "+j);
		
		System.out.println("-------------------");
		char z=97;
		System.out.println(z);
		
		System.out.println("-------------------");
		
		System.out.println((char)98);
		System.out.println((int)78.54);
		System.out.println("A"+"B");
		System.out.println("A"+20);
		System.out.println('A'+'B');
		System.out.println('a'+20);
		
		
		
	}
}
