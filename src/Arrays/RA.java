package Arrays;

import java.util.Scanner;

public class RA { //for array read method

	public static int[] Readarray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
	int a[]=new int[n];
		
	for(int i=0; i<a.length; i++) {
	a[i]=sc.nextInt();
}
	return a;
}}