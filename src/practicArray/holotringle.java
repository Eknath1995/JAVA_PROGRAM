package practicArray;

import java.util.Scanner;

public class holotringle {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		int sp=n/2, st=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
		for(int j=1; j<=st; j++) {
			if(j==1 || j==st) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		if(i<=n/2) {
			sp--;
		st=st+2;
		}
		else {
			sp++;
			st=st-2;
		}
		
		}
}
}