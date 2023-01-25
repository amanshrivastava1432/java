package in.co.oop;

public class account {
	private String number;
	private String accounType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccounType() {
		return accounType;
	}
	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}
	public double getBalance() {
		return balance;
	}
	
	public double diposite(double amount) {
		if (amount < 0) {
			System.out.println("Please deposite only + value!!");
		}else if(amount == 0) {
			System.out.println("Please enter greater than 0");
		}else {
		balance += amount;
		}
		return balance;
	}
	public double withdrawal(double amount) {
		balance -= amount;
		
		return balance;
		
	}
	public double paybill(double amount) {
		balance -= amount;
		
		return balance;
		
	}

}
