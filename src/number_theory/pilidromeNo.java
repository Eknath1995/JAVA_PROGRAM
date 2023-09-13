 package number_theory;

import java.util.Scanner;

public class pilidromeNo {
	public static boolean IspipdromeNo(int n) {
		int rev=0, temp=n;
		while(n>0) {
			int d=n%10;
			
			rev=rev*10+d;
			n=n/10;
		}
		return rev==temp;			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		if(IspipdromeNo(n)) {
			System.out.println(n+" is pilidrome no");
		}
			else {
			System.out.println(n+"is not pilidrome no");
		}
	}
}
