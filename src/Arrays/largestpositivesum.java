package Arrays;

public class largestpositivesum {

	public static void main(String []args) {
		int[] n=RA.Readarray();
		int sum=0, max=0;
		for(int i=0; i<n.length; i++) {
			
			if(n[i]<0) {
				
				if(sum>max) {
					max=sum;
						}
					sum=0;
					}
					else{
				 
					sum=sum+n[i];
						}
	
				if(sum>max) {
					max=sum;
	              }
				}
		System.out.println(max);
		
	}}
				
			

	

		
		
		
		
		
		
		
		
		
		
		
		
		