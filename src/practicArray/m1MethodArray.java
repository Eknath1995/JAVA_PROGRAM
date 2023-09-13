package practicArray;

import java.util.Scanner;

import Arrays.PA;
import Arrays.RA;

public class m1MethodArray {
	public static void main(String[] args) {
		
		int a[]=RA.Readarray();
		m1(a);
		PA.displayArray(a);
		
	}
	public static void m1(int a[]) {
		
		for(int i=0; i<a.length; i++) {
			a[i]=a[i];
		}
	}
}
