package TwoDArrays;

public class sum_of_all_Element {
	public static void main(String[] args) {
		
	int a[][]=read.ReadMatrix();
	int sum=0;
	for(int i=0; i<a.length; i++) {
	
	for(int j=0; j<a[i].length; j++) {
		sum=sum+a[i][j];
	}}
	System.out.println(sum);
	
	}	
	}