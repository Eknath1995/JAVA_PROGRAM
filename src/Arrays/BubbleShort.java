package Arrays;
import java.util.Scanner;
public class BubbleShort {
public static void main(String[] args) {
	int[] a=RA.Readarray();
	bubleShort(a);
	System.out.println("array after shorting");
	PA.displayArray(a);
}

	


public static void bubleShort(int[] a) {
	
	for(int i=0; i<a.length; i++) {
		boolean x=true;
		for(int j=0; j<a.length-1-i; j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				x=false;
			}}
			if(x==true)
				return;
	}}}
		






