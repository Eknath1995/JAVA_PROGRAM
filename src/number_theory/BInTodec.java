package number_theory;

import java.util.Scanner;

public class BInTodec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int bin=sc.nextInt();
		int sum=0, base=1;
		while(bin>0) {
			int d=bin%10;
			sum=sum+d*base;
			base=base*2;
			bin=bin/10;
			
		}
		System.out.println(sum);
	}
	
	
	
}
