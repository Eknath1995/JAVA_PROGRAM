package collection;

import java.util.ArrayList;
// we use arraylist for selection and sorting.
// but not for insertion and removing.   // delay in shifting.

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("ek");
		ar.add("nath");				
		ar.add(123);
		ar.add(5.4);
		ar.add('A');
		ar.add(65.44f);
		
	System.out.println("Collection object of : "+ar);
		ar.add("java");
		ar.add("ek");
		ar.add(123);
		ar.add("ek");
	System.out.println("Collection after adding duplicate : "+ ar);
		ar.add(null);
	Integer i=new Integer(100);
		ar.add(i);
		ar.remove(0);
		System.out.println(ar);
		ar.remove("java");
		System.out.println(ar);
		ar.set(2,"pandu");
	System.out.println(ar);
		ar.get(0);
		ar.isEmpty();
		ar.size();
	System.out.println(ar.get(2));
	System.out.println(ar.isEmpty());
	ar.clear();
	System.out.println(ar);
	}
}


