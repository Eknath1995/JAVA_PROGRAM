package TwoDArrays;

public class spiral {
public static void main(String[] args) {
	int a[][]=read.ReadMatrix();
	
	int n=a.length;
	for(int i=0, j=n-1; i<j; i++, j--) {
		for(int k=i; k<j; k++) {
			System.out.println(a[i][k]+" ");
		}
	   for(int k=i; k<j; k++) {
		   System.out.println(a[k][j]+" ");
	   }
   for(int k=j; k>i; k--) {
		   System.out.println(a[j][k]+" ");
	   }  
	   for(int k=j; k>i; k--) {
		   System.out.println(a[k][i]+" ");
	   }	   
	}
	if(a.length%2==1)
		System.out.println(a[a.length/2][a.length/2]);
}
}
