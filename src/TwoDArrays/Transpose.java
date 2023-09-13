package TwoDArrays;

public class Transpose {
public static void main(String[] args) {
	 int a[][]=read.ReadMatrix();
	 int b[][]=new int [a[0].length][a.length];
	
	 b=Transpose(a);
	
	 read.DisplayMatrix(b);
}
public static int[][] Transpose(int a[][]) {
 int[][] b=new int[a[0].length][a.length];
 for(int i=0; i<a[0].length; i++) {
	 for(int j=0; j<a.length; j++) {
		
		 b[i][j]=a[j][i];
	 }}
 		return b;
}
}
