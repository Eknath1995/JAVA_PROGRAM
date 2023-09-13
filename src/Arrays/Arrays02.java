package Arrays;

import java.util.Scanner;

public class Arrays02 {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
			
		byte a[]=new byte[n];
			
		for(int i=0; i<a.length; i++) {
		a[i]=sc.nextByte();
		}
		String s="";
		for(int i=0; i<a.length; i++) {
			 s=s+((char)a[i]);
		}
System.out.println(s);
		}
		}
	


