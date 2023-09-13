package String_practice;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strine value");
		String s=sc.nextLine();
		
		if(Ispanagram(s))
			System.out.println("Sting is panagram");
		else
			System.out.println("String is not panagram");
		
	}
	public static boolean Ispanagram(String s) {
		if(s.length()<26)
		return false;
		
		for(char c='a'; c<='z'; c++) {
			if(s.indexOf(c)==-1) {
				return false;
		}
	}
		return true;
		}
}
