package practicArray;

import java.util.Scanner;

public class holotri {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		int sp=0, st=0;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
		for(int j=i; j>=1; j--) {
			 
				System.out.print("*");
			
		}
		System.out.println();

			sp++;
		st--;
		
		
		
		}
}
}
