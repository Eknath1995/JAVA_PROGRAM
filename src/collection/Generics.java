package collection;

import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
			list.add(123);
			list.add(143);
		//	list.add("abc");  CTE

		System.out.println(list);
		
		ArrayList<String> list1= new ArrayList<>();
		list1.add("ek");
		list1.add("nath");
		list1.add("abc");
		list1.add("def");
		list1.add("ghi");
		list1.add("jkl");
		
	//   list1.add(123);   CTE
		
		System.out.println(list1);
		
}}
