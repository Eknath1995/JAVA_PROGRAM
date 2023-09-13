package Arrays;

import java.util.Scanner;

public class mergetwoarray {
	public static void main(String[] args) {
		int a[]=RA.Readarray();
		int b[]=RA.Readarray();
		int c[]=merge(a,b);
		PA.displayArray(c);
	}

public static int[] merge(int a[], int b[]) {
	int c[]=new int[a.length+b.length];
	int j=0;
	for(int i=0; i<a.length; i++) {
		c[j]=a[i];
		j++;
	}
	for(int i=0; i<b.length; i++) {
		c[j]=b[i];
		j++;
	}
	return c;
}}