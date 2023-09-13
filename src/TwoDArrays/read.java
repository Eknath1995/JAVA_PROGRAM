package TwoDArrays;

import java.util.Scanner;

public class read {
public static int[][] ReadMatrix() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows");
	int row=sc.nextInt();
	System.out.println("Enter the cols");
	int col=sc.nextInt();
	int[][] a=new int[row][col];
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++ ) {
			a[i][j]=sc.nextInt();
		}
	}
		return a;
}

 public static void DisplayMatrix(int a[][]){
	 for(int i=0; i<a.length; i++) {
		 for(int j=0; j<a[i].length; j++) {
			 System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
	 }
 }}
