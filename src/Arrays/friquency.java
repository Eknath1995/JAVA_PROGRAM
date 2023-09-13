package Arrays;

public class friquency {
//	public static void main(String[] args) {
//		int a[]=RA.Readarray();
//		friquency(a);
//		
//	}
//	public static void friquency(int a[]) {
//		boolean b[]=new boolean[a.length];
//		
//		for(int i=0; i<a.length; i++) {
//			if(b[i]==false) {
//				 int count = 1;
//			
//		for(int j=i+1; j<a.length; j++) {
//			if(a[i]==a[j]) {
//				count++;
//				b[i]=true;
//			}}
//		System.out.println(a[i]+"-->"+count+"times");
//			}}}
	
	public static void main(String[] args) {
		int a[]=RA.Readarray();
		
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		int b[]=new int[max+1];
		
	for(int i=0; i<a.length; i++) {
		b[a[i]]++;
	}
		for(int i=0; i<b.length; i++) {
			if(b[i]!=0)
		System.out.println(i+"-->"+b[i]+"times");
		}
	}
}






	

