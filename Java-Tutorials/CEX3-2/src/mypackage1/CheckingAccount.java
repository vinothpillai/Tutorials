package mypackage1;

public class CheckingAccount {
	
	int mBalance;
	
	CheckingAccount(int bal){
		mBalance = bal;
	}
	
	public void transferFunds(int transAmnt) throws NoFundsException{
		if(mBalance < transAmnt){
			throw new NoFundsException(transAmnt);
		}else{
			System.out.println("execute transfer funds");
		}
		
	}
}
