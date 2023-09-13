package Arrays;

public class evenodd {

	public static void main(String[] args) {
		
		int a[]=RA.Readarray();

	int ocount=0;
	int ecount=0 ;
	  for(int i=0; i<a.length; i++) {
		  if(a[i]%2==0)
			  ecount=ecount+a[i];
		  else
			  ocount=ocount+a[i];
	}
System.out.println("sum of even numbers "+  ecount);
System.out.println("sum of odd numbers "+  ocount);
}
}