package String_practice;

import java.util.Scanner;

public class String_Friquency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		int a[]=new int [123];
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			a[c]++;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>0)
				System.out.println((char)i+"-->"+a[i]);
		}
	}
}
