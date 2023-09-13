package ObjectClass;


import java.util.ArrayList;


public class B {
	
	public static void main(String[] args) {
		
	//	B b1=new B();
		
	//	B b2=new B();
		
	//	System.out.println(b1.hashCode()); //Hashcode method :- used to allocate
	//	System.out.println(b2.hashCode());             // memory to an object.
		
	//	System.out.println(b1);
	//	System.out.println(b2);
		
	//	System.out.println(b1.equals(b2)); // equals method:- compare to object on 
												// the bases of ref or address.
		
		
		
		ArrayList al=new ArrayList();
		al.add(10);	//<----    	two things will happen 		
		al.add("a");		// 1] auto unboxing (converted primitive data to non primitive data)
		al.add("b");		// 2] upcasting to object.
		al.add("c");
		al.add("d");
		System.out.println(al);
	}
	
	
	
	
	

}






