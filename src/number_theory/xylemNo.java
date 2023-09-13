package number_theory;

import java.util.Scanner;

public class xylemNo {
	public static boolean Isxylem(int n) {
		int msum=0;
		int esum=n%10;
		n=n/10;
		
		while(n>9) {
			int d=n%10;
			msum=msum+d;
			n=n/10;
		}
		esum=esum+n;
		return esum==msum;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();

		if(Isxylem(n)) {
			System.out.println(n+" is xylem no");
			
		}else {
			System.out.println(n+" is not xylem no");
			
		}
	}

}
