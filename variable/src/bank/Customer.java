package bank;

public class Customer {
	
	private String bankAcount;
	private String owner;
	private int balance;
	
	public Customer(String bankAcount, String owner, int balance) {
		this.bankAcount = bankAcount;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getBankAcount() {
		return bankAcount;
	}
	
	public void setBankAcount(String bankAcount) {
		this.bankAcount = bankAcount;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAccountInfo( ) {
		System.out.println("계좌번호: " + this.bankAcount 
						+ ", 예금주: " + this.owner 
						+ ", 잔액: " + this.balance);
	}
	
	

}
