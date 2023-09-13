package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapPractice {
	
	public static void main(String[] args) {
		Map <String, Integer> rcb= new HashMap<>();
		
		rcb.put("virat",18);
		rcb.put("ABD", 17);
		rcb.put("EKNATH", 123);
		rcb.put("aruna", 23);
		rcb.put(null, 1);
		rcb.put("faf", 16);
		rcb.put("virat", 81);
//		rcb.clear();
		
		System.out.println(rcb);
	System.out.println(rcb.size());

		
		
		Map<String,Integer> UP=new LinkedHashMap<>();
		UP.put("pardeep Narwal", 9);
		UP.putAll(rcb);

		UP.put("Nitesh",12);
		System.out.println(	UP.remove("virat"));
		UP.put("sumit", 13);
		System.out.println(UP);
		

//		UP.size();
		System.out.println(UP.size());
	

	}
	
	

}
