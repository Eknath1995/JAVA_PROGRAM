package Arrays;

public class perfectNo {

	public static void main(String[] args) {
		
		int a[]=RA.Readarray();
		boolean b=Isperfect(a);
			

		for(int i=0; i<a.length; i++) {
			if(a[i] !=0) 
					
			if( b==true)
				
				System.out.println(a[i]+" ");
		}
		}
	
public static boolean Isperfect(int a[]) {
	int sum=0; int temp=a[0];
	for(int i=1; i<=a.length/2; i++) {
		if(a[i]%i==0)
			sum=sum+i;
	}
	return sum==a[0];
}
}
