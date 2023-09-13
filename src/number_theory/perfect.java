package number_theory;

import java.util.Scanner;

public class perfect {
	public static boolean Isperfect(int n) {
		int sum=0;
	for(int i=1; i<=n/2; i++) {
		if(n%i==0)
			sum=sum+i;
			
		}
		return sum==n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		if(Isperfect(n))
		System.out.println(n+"is perfect no");
		else
			System.out.println(n+" is not perfect no");
	}	
	
}
