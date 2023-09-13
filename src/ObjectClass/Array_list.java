package ObjectClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {
 public static void main(String[] args) {
	ArrayList al = new ArrayList();
	 for(int i=1;i<=10;i++) {
		 al.add(i);
		 
	 }
	 System.out.println(al);
	 System.out.println(al.size());
	 al.add("xyz");
	 al.add(20.45);
	 al.add(false);
	 System.out.println(al);
	 System.out.println(al.size());
	 al.remove("xyz");
	 System.out.println(al);
	 al.add("pawan");
	 al.add(0,"abc");
	 System.out.println(al);
	 al.set(0, "pawan");
	 System.out.println(al);
	 System.out.println(al.isEmpty());
	 al.clear();
 System.out.println(al.size());
System.out.println(al.isEmpty());
	 
	 
	 ArrayList list = new ArrayList(al);
	 list.add("done dona done");
	 list.add("done ");
	 list.add("done dggifsaiugifqwona done");
	 list.add(234);
	 System.out.println(list);
	 System.out.println(list.size());
	 
	 
	 
	 
	
}
}
