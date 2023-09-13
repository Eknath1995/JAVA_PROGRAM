package Strng;

import java.util.Scanner;

public class panagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	
	if(Ispanagram(s)) {
	System.out.println("is panagram");
 }
	else {
		System.out.println("is not a panagram");
}}
 public static boolean Ispanagram(String s) {
	 if(s.length()<26)
		 return false;
	 
	 for(char c='a'; c<='z'; c++) {
		if(s.indexOf(c)==-1)
			
			return false;
	 }
		return true;
	 }
 }
 
 
 

