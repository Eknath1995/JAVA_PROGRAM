package Arrays;

public class Minelement {

	public static void main(String[] args) {
	
		int[] a=RA.Readarray();
	
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
	}
	
}
