package mypackage1;

public class NoFundsException extends Exception {
	
	   private double amount;
	   
	   NoFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   
	   public double getAmount()
	   {
	      return amount;
	   }
}
