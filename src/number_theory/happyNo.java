package number_theory;

import java.util.Scanner;

public class happyNo {
	public static int sumsquare(int n) {
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+(d*d);
			n=n/10;
		}return sum;
	}
	public static boolean IshappyNO(int n) {
		while(n>9) {
			n= sumsquare(n);
		}	
	return n==1 || n==7 ;
	}	
	
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	if(IshappyNO(n)) {
		System.out.println(n+"is happy number");
	}
	else {
		System.out.println(n+"is not happy number");
	}
		
	
}

}
