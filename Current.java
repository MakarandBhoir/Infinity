package test3;

public class Current extends Account {
	private double overdraft;
	
	public Current(int number, String holder, double balance, double overdraft){
		super(number, holder, balance);
		this.overdraft = overdraft;
	}
	public void displayCurrent() {
		super.display();
		System.out.println("Overdraft = "+overdraft);
	}
}
