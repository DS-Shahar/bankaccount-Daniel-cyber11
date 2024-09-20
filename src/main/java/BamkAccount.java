
public class BamkAccount {
	private int balance = 0;
	private int minBalance = -5000;

	public int getBalance() {
		return balance;
	}

	public int getminBalance() {
		return minBalance;
	}

	public int setBalance(int num) {
		if (num >= minBalance) {
			balance = num;
		}
		return balance;
	}
	
	/*
	accepts only balance above minbalance
	 */
	public BamkAccount(int balance, int minbalance) {
		this.balance=balance;
		this.minBalance=minbalance;
	}
	
	
	
	public void deposit (int money) {
		balance+=money; 
	}
	
	public void transfer (int sum) {
	}
}


