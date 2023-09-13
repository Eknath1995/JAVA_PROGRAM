package Arrays;

public class primeNo {
	public static void main(String[] args) {
		int[] a=RA.Readarray();
		int count=0;
		for(int i=0; i<a.length; i++) {
			boolean b=IsprimeNO(a[i]);
			if(b==true)
				count++;
		}
			System.out.print(count) ;
	}
	
	public static boolean IsprimeNO(int n) {
		if(n==1)
			return false;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
			return false;
		}
		
		return true;
	}
}
