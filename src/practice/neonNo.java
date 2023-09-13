package practice;

import java.util.Scanner;

public class neonNo {
/* public static int sum(int n) {
	 int sum=0;
	 while(n>0) {
		 int d=n%10;
		 sum=sum+d;
		 n=n/10;
	 }
	 return sum;
 }*/
/*
 * public static int countdigit(int n) { int count=0; do { count++; n=n/10;
 * }while(n!=0); return count; }
 */
 /*
 public static int power(int m, int n) {
	int p=1;
	while(n>0) {
		p=p*m;
		n--;
		}
	return p;
 }*/
 
 public static int square(int n) {
	 int sum=0;
	 while(n>0) {
		 int d=n%10;
		 sum=sum+(d*d);
		 n=n/10;
	 		}
	 return sum;
 }  

	/*
	 * public static boolean ISneonNO(int n) { int s=square(n); int sum=0, temp=n;
	 * while(n>0) {
	 * 
	 * int d=n%10; sum=sum+d; } return sum==temp;
	 * 
	 * }
	 */
 			//neon number
 public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=0, temp=n;
		int s=(n*n);

		while(s>0) {
			int d=s%10;
			sum=sum+d;
			s=s/10;
		}
			
		if(sum==temp)
			System.out.println(n+" is neon no");
		else
			System.out.println(n+" is not neon no");
			
 }}