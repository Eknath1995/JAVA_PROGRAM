package practice;

public class FromBegning {
	public static void main(String[] args) {
		int a=7;
		int b=a++ - --a + ++a + a*(--a);
		System.out.println(a);
		System.out.println(b);
	}
}
