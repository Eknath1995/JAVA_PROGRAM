package Arrays;

public class Selection_Sort {
	public static void main(String[] args) {
		int a[]=RA.Readarray();
		selection(a);
		PA.displayArray(a);
	}
		public static void selection(int a[]) {
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}}
		}
	}
}
