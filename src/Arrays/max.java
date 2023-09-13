package Arrays;

public class max {

	public static void main(String[] args) {
		
		int[] a=RA.Readarray();
	int max=a[0];
	for(int i=0; i<a.length; i++) {
		if(a[i]>max)
			max=a[i];
	}
	System.out.println(max);
}
}
