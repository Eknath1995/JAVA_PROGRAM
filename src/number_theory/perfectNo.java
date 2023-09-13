package number_theory;

import java.util.Scanner;

public class perfectNo {
 public static boolean perfect(int n) {
	 int sum=0 ,temp=n;
	 
	 
	 for(int i=1; i<=n/2; i++) {
		 if(n%i==0) {
			 sum=sum+i;
		 }
	 }
		
	 
	return sum==temp;}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		boolean b= perfect(n);
				if(b==true)
					System.out.println(n+"is perfect no");
				else 
					System.out.println(n+"is not perfect no");
		
	}
	 
 }

