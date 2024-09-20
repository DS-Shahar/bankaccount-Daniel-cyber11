
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
	 * accepts only balance above minbalance
	 */
	public BamkAccount(int balance, int minbalance) {
		this.balance = balance;
		this.minBalance = minbalance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void transfer(int sum) {
	}
	
	
	 public boolean withdraw(int amount) {
	        if (balance - amount < minBalance)
	            return false;
	        balance = balance - amount;
	        return true;
	    }

	
	
	
	 public boolean transfer(BamkAccount target, int amount) {
		 if (withdraw(amount) == false)
	            return false;
	        target.deposit(amount);
		  return true;
	 
	 }


	public String toString() {
		String s = "";
		s += "balance: " + balance;
		return s;
	}

	
	
	
	

}




public class Main {
	public static void main(String[] args) {
		accounts();
	}

	public static void accounts() {
		BamkAccount acct1 = new BamkAccount(3000, -1000);
		System.out.println(acct1);
		System.out.println("bal" + acct1.setBalance(3));
		acct1.deposit(300);
        BamkAccount acct2 = new BamkAccount(3000, -1000);
        boolean success = acct1.transfer(acct2, 500);
        System.out.println("transfer success = " + success);

        /*******************rectangle*************/
        // Create two rectangles
        ractangle rect1 = new ractangle(10, 8);
        ractangle rect2 = new ractangle(5, 4);

        // Draw the two rectangles
        System.out.println("First Rectangle:");
        rect1.draw();
        
        System.out.println("Second Rectangle:");
        rect2.draw();
        
        /*draw the rectangle it the double sized*/
        rect1.doubleSize();//קוראת להכפלה ומבצעת את הפעולה על המידות
        System.out.println("First Rectangle:");
        rect1.draw();
        
        
        //ההיקפים שלהם והשטחים
        System.out.println("שטח הריבוע הראשון: "+rect1.S());
        System.out.println("היקף הריבוע הראשון: "+rect1.p());
        System.out.println("שטח הריבוע השני: "+rect2.S());
        System.out.println("הירף הריבוע השני: "+rect2.p());
//משום מה אם אני עושה את התרגיל הנכון לחישוב שטח והיקף זה עושה לי את זה כפול שתיים
	
        System.out.println(rect1.toString()+rect2.toString());

	}

	

}
