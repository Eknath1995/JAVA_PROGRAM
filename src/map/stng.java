package map;

public class stng {
	public static void main(String[] args) {
	//	String(char[] c)
	
		// used to convert char array to sting.
		/*
		 * char[] c= {'e', 'k',' ', 'n', 'a', ' ', 't', 'h',' '};
		 * 
		 * String s=new String(c); System.out.println(s);
		 */
		
		
		String s="today is friday tommorow is saturday ";
//		System.out.println(s.length());
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i==0&& c[i]!=' ' || c[i]!=' ' &&c[i-1]==' ') {
		
				
			
	String a=touppercase(c);
			
			System.out.println(a);
			
			}
				
			}
	}}

	
	
	

