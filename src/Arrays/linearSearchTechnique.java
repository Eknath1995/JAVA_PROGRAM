package Arrays;

import java.util.Scanner;

public class linearSearchTechnique {
public static void main(String[] args) {
	

	int[] a=RA.Readarray();
	Scanner sc =new Scanner(System.in); 
	System.out.println("Enter the key");
	int key=sc.nextInt();
	int index=linearSearch(key, a);
		if(index>=0) {
			System.out.println(key+" is present in "+index +" index");
		}
		else {
			System.out.println(key+" is not present in "+index+" index");
		}
}
public static int linearSearch(int Key ,int[]a) {
	for(int i=0; i<a.length; i++)
	if(a[i]==Key) {
		return i;
	}
	return -1;
}}