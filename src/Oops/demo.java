package Oops;
		//constructor chaining
public class demo {
	/*
	 * demo(){ this(999); System.out.println(1); }
	 * 
	 * demo(int a){ System.out.println(2); }
	 * 
	 * public static void main(String[] args) { demo f=new demo();
	 * 
	 * }
	 */

	demo(int age){ 
		this(5.5);
		System.out.println(age);
	}
	
	demo(String name){
		this(20);
		System.out.println(name);
	}

	demo(double height){
	
		System.out.println(height);
	}
	
	demo(){
		this("asd");
		System.out.println("END");
	}

public static void main(String[] args) {
	demo d=new demo();
}






}
