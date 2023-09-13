package String_practice;

import java.util.Scanner;


public class pallindrome {
	public static void main(String[] args) {
//		
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the string");
//	String s=sc.nextLine();
//	
//	if(Ispallindrome(s)) {
//		System.out.println("is pallindrome");
//	}
//	else
//		System.out.println("is not pallindrome");
//	
//	
//	}
//	
//	public static boolean Ispallindrome(String s) {
//		int l=s.length()-1;
//	for(int i=0; i<s.length()/2; i++) {
//		if(s.charAt(i) != s.charAt(l))
//			return false;
//		l--;
//	}
//		return true;
//	}}

	String actual="madam";
	String rev="";
	for(int i=actual.length()-1; i>=0; i--) {
		rev=rev+actual.charAt(i);
	}
	System.out.println("actual String : "+actual);
	System.out.println("rev String : "+rev);
	if(actual.equals(rev)) {
		System.out.println("Given String is pallindrome");
}}
	
}






