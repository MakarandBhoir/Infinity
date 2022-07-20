package test3;

public class Saving extends Account {
	private double roi;
	
	public Saving(int number, String holder, double balance, double roi){
		super(number, holder, balance);
		this.roi = roi;
	}
	public void displaySaving() {
		super.display();
		System.out.println("ROI = "+roi);
	}
}
