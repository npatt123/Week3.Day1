package week3.Day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit method is from Axis bank  class");
	}
	
	public static void main(String[] args) {
		
		AxisBank deposit = new AxisBank();
		deposit.fixed();
		deposit.saving();
		deposit.deposit();
	
	}

}
