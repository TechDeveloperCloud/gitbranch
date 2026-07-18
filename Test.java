public class RBI {

    private double balance;

    // Deposit method
    public void deposit(double amount) {

         if(amount >0)
	 {

            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
