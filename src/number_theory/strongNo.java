package number_theory;

import java.util.Scanner;

public class strongNo {
	public static int fact(int n) {
		int p=1;
	while(n>0) {
		p=p*n;
		n--;
	}
	return p;	
	}	
	
	public static boolean Isstrong(int n) {
		int sum=0, temp=n;
		
	while(n>0) {
		int d=n%10;
		int f=fact(d);
		sum=sum+f;
		n=n/10;
		}
		return sum==temp;
	}

	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int n=sc.nextInt();
		
	if(Isstrong(n))	{
		
		System.out.println(n+"is a strong number ");
	}
		
	else {
		System.out.println(n+"is not a strong number");
	}
		
	}	
	}	
		
		
