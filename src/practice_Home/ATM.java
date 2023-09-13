package practice_Home;

public class ATM implements Bank {

	int balance =10000;
	
	@Override
	public void Deposite(int amount) {
		System.out.println("depositing Rs."+ amount);
		balance= balance+amount;
		System.out.println("Amount deposited successfully");
	}

	@Override
	public void withdall(int amount) {
		System.out.println("Withrawing Rs."+amount);
		balance =balance-amount;
		System.out.println("Amount withdrall successfully");
	}

	@Override
	public void checkBalance() {
		System.out.println("available balance Rs."+balance);
		
	}
		
	}

