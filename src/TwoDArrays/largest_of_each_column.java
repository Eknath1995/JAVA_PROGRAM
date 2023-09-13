package TwoDArrays;

public class largest_of_each_column {
public static void main(String[] args) {
	int a[][]=read.ReadMatrix();
	
	for(int i=0; i<a[i].length; i++) {
	int max=a[0][i];
		for(int k=0; k<a.length; k++) {
			if(a[k][i]>max)
				max=a[k][i];
		}
		System.out.println(max+"is largest in "+ i +" column");
	}
			
}
}
