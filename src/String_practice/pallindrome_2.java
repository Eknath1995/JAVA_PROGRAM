package String_practice;

import java.util.Scanner;

public class pallindrome_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String value");
		String s=sc.nextLine();
		
//		if(Ispallindrome(s))
//			System.out.println("given Stirng is pallindrome");
//		
//		else
//			System.out.println("given String is not pallindrome");
//	}
//		public static boolean Ispallindrome(String s) {
//			int l=s.length()-1;
//			
//			for(int i=0; i<s.length(); i++) {
//				if(s.charAt(i)!=s.charAt(l))
//					return false;
//				l--;
//		}
//			return true;
	
		
		String out="";
		int l=s.length()-1;
		for(int i=0; i<s.length(); i++) {
			
			out=out+s.charAt(i);
			
		}
	System.out.println("actual String : "+ s);
	System.out.println("pallindrome String : "+out);
	
	if(s.endsWith(out))
		System.out.println("String is pallindrome");
	else
		System.out.println("String is not pallindrome");
	}
}












