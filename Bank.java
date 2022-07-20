package test3;

public class Bank {
	public static void main(String[] args) {
		Saving saving = new Saving(101010, "Athrva", 1000, 4.5);
		Current current = new Current(110011, "Infinity Ltd", 500000, 50000);
		
		saving.displaySaving();
		System.out.println("----------------------------------------");
		current.displayCurrent();
	}
}
