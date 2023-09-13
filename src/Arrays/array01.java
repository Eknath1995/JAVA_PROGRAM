package Arrays;

import java.util.Scanner;

public class array01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();//4
		
	String a[]=new String[n];
		
	for(int i=0; i<n; i++)
	{
		a[i]=sc.next();
	}
	for(int i=0; i<n; i++) {
		System.out.print(a[i]+" ");
	}

	}

}
