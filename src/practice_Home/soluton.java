package practice_Home;

import java.util.Scanner;

public class soluton {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Bank b= new ATM();
		while(true) {
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			
		switch(choice) {
		case 1:
			   System.out.println("Enter the deposited amount");
			   int amount=sc.nextInt();
			   b.Deposite(amount);
			   break;
			   
		case 2:
			   System.out.println("Enter the amount to be withdrall");
			   int amtwthd=sc.nextInt();
			   b.withdall(amtwthd);
			   break;
			   
		case 3:
				b.checkBalance();
				break;
				
		case 4:
			    System.out.println("thank you");
			    System.exit(0);
			    
		default :
			    System.out.println("invalid choice");
		}
		System.out.println("-----------------------------------------");
		}
	}
}
