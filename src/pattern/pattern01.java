package pattern;

import java.util.Scanner;

public class pattern01 {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();

		int k=n/2+1;
	for(int i=1; i<=n; i++) {
		
		for(int j=1; j<=k; j++) {
			System.out.print("* ");
		}
		if(i<=n/2) {
			
			k--;
		}
		else {
			k++;
		}
		System.out.println();
	}
	
	
	
	}

}
