package pattern;

import java.util.Scanner;

public class pattern07 {
/*	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();

		int sp=0, st=n; 
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				
				System.out.print(" ");
			}
			for(int j=1; j<=st; j++) {
				System.out.print("*");
			}	
			System.out.println();	
		sp++;
		st--;
		}
		}
		}*/
		
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();

		int sp=0, st=n; 
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				
				System.out.print(" ");
			}
			for(int j=1; j<=st; j++) {
				System.out.print(j);
			}	
			System.out.println();	
		sp++; st--;
		
		}
		}
		}
		

