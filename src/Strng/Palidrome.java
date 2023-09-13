package Strng;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		if(Ispalidrome(s)) {
			System.out.println("is poalidrome ");
		}
		else 
			System.out.println("is not palidrome");
	}
	
	
	
	
	public static boolean Ispalidrome(String s) {
		int l=s.length()-1;
		
		for(int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(l)) 
				return false;
			l--;
			}
			return true;
		}
	}

