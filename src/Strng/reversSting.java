package Strng;

import java.util.Scanner;

public class reversSting {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s= sc.nextLine();
			
			String out="";
			for(int i=s.length()-1; i>=0; i--) {
				
				char c=s.charAt(i);
				
				out=out+c;
			}
			System.out.println(out);
					}
}





