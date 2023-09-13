package Arrays;

public class How_many_primeNO {

	public static void main(String[] args) {
		int[]a=RA.Readarray();
		int c=0;
		for(int i=0; i<a.length; i++) {
	 boolean b = Isprime(a[i]);
		if(b==true)
				c++;
	}
		
	System.out.println(c+"prime numbers are ther in an array");

}
	
 public static boolean Isprime(int n) {
	 if(n==1)
		 return false;
	 for(int i=2; i<n/2; i++) {
		 if(n%i==0)
			 return false;
	 }
	 return true;
 }
}
