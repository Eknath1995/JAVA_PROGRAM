package TwoDArrays;

public class largest_of_each_rows {
public static void main(String[] args) {
int a[][]=read.ReadMatrix();
	for(int i=0; i<a.length; i++) {
		int max=a[i][0];
		for(int k=0; k<a[i].length; k++) {
			if(a[i][k]>max)
				max=a[i][k];
			
		
	}
	System.out.println(i+"Row max element is "+max);
	}
}
}
