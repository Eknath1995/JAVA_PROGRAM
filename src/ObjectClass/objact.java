package ObjectClass;


import Oops.car;

public class objact {
	public static void main(String[] args) {
		car c1=new car("abc", "ford","black",7000);
		
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		
		car c2 = new car("jaguar","jag","red",150);
		System.out.println(c2.toString());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		
		car c3=c1;
		System.out.println(c3);
		System.out.println(c1.equals(c3));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
