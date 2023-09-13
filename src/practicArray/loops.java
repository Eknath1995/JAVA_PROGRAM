package practicArray;

public class loops {
 public static void main(String[] args) {
	int n=123456, count=0;
//	for(int i=1; i<=n; i++) {
//	
//	for(int j=1; j<=n; j++) {
//		System.out.print("* ");
//	}
//	System.out.println();
//}
	
	//digit count
	while(n!=0) {
		
		System.out.println(n%10);
		n=n/10;
		count++;
	
		
	}
	System.out.println();
	System.out.println(count);
 
 }
}
