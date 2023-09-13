package String_practice;

import java.util.Scanner;

public class Rev_String {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String value");
		
		String s=sc.nextLine();
		
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Actual String : "+ s);
		System.out.println("reversed String : "+rev);
		
	}
}
