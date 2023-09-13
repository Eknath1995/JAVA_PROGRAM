package practice_Home;

public class Bank_Test {
	public static void main(String[] args) {
		ATM a= new ATM();
		a.checkBalance();
		System.out.println("-------------------------");
		
		a.Deposite(5000);
		a.checkBalance();
		System.out.println("-------------------------");
		
		a.withdall(500);
		a.checkBalance();
	}
}
