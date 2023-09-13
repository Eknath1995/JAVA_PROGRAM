package number_theory;

import java.util.Scanner;

public class prime {
	public static boolean Isprime(int n) {
		if(n==1)
			return false;
		
	for(int i=2; i<=n/2; i++) {
		
		if(n%i==0)
			return false;
	}
	return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		/*if(Isprime(n)) {
		
			System.out.println(n+"is prime number");
		}
		else {
			System.out.println(n+"is not prime number");
		}
		*/
		for(int i=1; i<=1000; i++) {
			
			boolean b=Isprime(i);
			if(b==true)
				System.out.println(i);
		}
	}
	}
		
	
	