package Arrays;
import java.util.Scanner;
public class zigzag {

	public static void main(String[] args) {
		int a[]=RA.Readarray();
		int b[]=RA.Readarray();
		int c[]=zigzag(a,b);
		PA.displayArray(c);
	}

public static int[] zigzag(int a[], int b[]) {
	int c[]=new int[a.length+b.length];
	int j=0, i=0;
	int n=a.length<b.length? a.length: b.length;
	
	while(i<n) {
		c[j]=a[i];
		j++;
		c[j]=b[i];
		j++; i++;
	}
	while(i<a.length) {
		c[j]=a[i];
		j++; i++;
	}
	while(i<b.length) {
		c[j]=b[i];
		j++; i++;
	}
	return c;
}}

