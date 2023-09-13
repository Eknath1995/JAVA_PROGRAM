package ObjectClass;

public class object {

	//some important method in object class.
	
	// 1] int         Hashcode();
	// 2] boolean     equals(object obj);
	// 3] String      toString();
	// 4] void        finalize();
	// 5] object      clone();
	
	public static void main(String[] args) {
		int a=10;  //primitive variable
		
		Integer o=a; //non primitive variable  //auto boxing
		
		int b=o;  //auto unboxing
		
		System.out.println(b);
		
	//	-----------------------------------
	/*	
		// parse method :- it is used to convert String representation of a 
		  		// 		number to actual number, you have to pass a valid 
		  		//		string with only numbers to parsing method.
*/		
		
		String s="123";
		int val=  Integer.parseInt(s);
		System.out.println(val);
		
		String c="50";
		long v=Integer.parseInt(c);
		System.out.println(v);
		
		float f=Float.parseFloat("98765");
		System.out.println(f);
	}
	
}








