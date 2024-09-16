
public class BankAccount {
	
	  private int minBalance;
	  private int balance;
	    
	public BankAccount(int balance, int minBalance) {
	      this.balance = balance;
	      this.minBalance = minBalance;
	 }
	public void deposit(int amount) {
	        balance = balance + amount;
	 }


    public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
    
    public boolean transfer (int transfer_amount,BankAccount receives_account) {
  
    	if (balance-transfer_amount>=minBalance) {
    		balance-=transfer_amount;
    		receives_account.balance+=transfer_amount;
    		return true;
    	}return false;
    	
    }
    
    
    public int getBalance() {
    	return balance;
    }
    public int getMinBalance() {
    	return minBalance;
    }
    public void setBalance(int balance1) {
    	this.balance=balance1;
    }
    public void setMinBalance(int minBalance1) {
    	this.minBalance=minBalance1;
    }
    


}
