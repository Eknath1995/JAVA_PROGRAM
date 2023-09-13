package practice;

import java.util.Scanner;

public class kkkkkkk {


 public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
	int sp=0, st=n;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=sp; j++) {
			System.out.print(" ");
		}
		int k=n/2+1;
		for(int j=1; j<=st; j++) {
			if(j<=(st/2)) {
			System.out.print(k--);
			}
			else {
				System.out.print(k++);
			}}
		System.out.println();
			if(i<=n/2) {
				sp++;
				st=st-2;
			}
			else {
				sp--;
				st=st+2;
			}
			}
		
		
		}}
 

