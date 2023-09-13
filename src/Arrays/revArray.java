package Arrays;

public class revArray {

	public static void main(String[] args) {
		int a[]=RA.Readarray();
		revarray(a);
		PA.displayArray(a);
	}
public static void revarray(int a[]) {
	
	for(int i=0; i<a.length/2; i++) {
		 int temp = a[i];
	a[i]=a[a.length-1-i];
	a[a.length-1-i]=temp;
}
}
}