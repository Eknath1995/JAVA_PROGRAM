package Arrays;

import java.util.Scanner;

public class DeleteAt {

	public static void main(String[] args) {
		int[] a=RA.Readarray();
		Scanner sc=new Scanner(System.in);
		System.out.println("at which index you have to delete");
		int index=sc.nextInt();
		
		a=DeleteAt(index, a);
		
		PA.displayArray(a);

	}
public static int[] DeleteAt(int index, int a[]) {
	if(index<0 || index>a.length)
		throw new ArrayIndexOutOfBoundsException();
	
	int b[]=new int[a.length-1];
	for(int i=0; i<index; i++)
		b[i]=a[i];
	
	
	for(int i=index+1; i<a.length; i++)
		b[i-1]=a[i];
	
	return b;
}

	}


