     
package Arrays;

import java.util.Scanner;

public class InsertAt {

	public static void main(String[] args) {
		int[] a=RA.Readarray();
		Scanner sc=new Scanner(System.in);
		System.out.println("at which index you have to insert");
		int index=sc.nextInt();
		System.out.println("enter the value");
		int value=sc.nextInt();
		a=InsertAt(index, value, a);
		
		PA.displayArray(a);

	}
public static int[] InsertAt(int index, int value, int a[]) {
	if(index<0 || index>a.length)
		throw new ArrayIndexOutOfBoundsException();
	
	int b[]=new int[a.length+1];
	for(int i=0; i<index; i++)
		b[i]=a[i];
	b[index]=value;
	
	for(int i=index; i<a.length; i++)
		b[i+1]=a[i];
	
	return b;
}
}
