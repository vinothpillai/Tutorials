package mypackage1;

public class StartExec {
	public static void main(String[] args){
	/*	LearnException test = new LearnException();
		test.readFile();*/
		
		CheckingAccount myAccnt = new CheckingAccount(45);
		try{
			myAccnt.transferFunds(500);
		}
		catch(NoFundsException custExcep){
			System.out.println("You reached exception");
		}finally{
			System.out.println("You reached finally exception");
		}
		
		
	}
}
