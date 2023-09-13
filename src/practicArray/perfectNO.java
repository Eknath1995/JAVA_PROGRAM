package practicArray;

public class perfectNO {
	public static boolean isperfect(int n) {
		int sum=0;
		
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum=sum+i;		// 1+2+4+7+14=28
			}}
		return sum==n;
		}
	
		public static void main(String[] args) {
		int n=28; // 1+2+4+7+14=28
		boolean b=isperfect(n);
		if(b==true) {
		System.out.println(n+" is peerfect no");
		}
		
		else
		System.out.println(n+" is not a perfect no");
	
	
	
	
		}
}
