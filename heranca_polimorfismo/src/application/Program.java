package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//OverRide
		//Account acc1 = new Account(1001,"Junior", 1000.0);
		//acc1.withdraw(200.0);
		//System.out.println(acc1.getBalance());
		
		//Account acc2 = new SavingsAccount(1002, "Jairo", 1000.0,0.01);
		//acc2.withdraw(200.0);
		//System.out.println(acc2.getBalance());
		
		//Account acc3 = new BusinessAccount(1003, "José", 1000.0,0.01);
		//acc3.withdraw(200.0);
		//System.out.println(acc3.getBalance());
		
		//BusinessAccount bacc = new BusinessAccount(1002,"Maria", 0.0, 500.0);
		
		// Upcasting
		//Account acc1 = bacc;
		//Account acc2 = new BusinessAccount(1003,"João", 0.0, 200.0);
		//Account acc3 = new SavingsAccount(1003,"Thierry", 0.0, 200.0);
		
		// Dowcasting
		//BusinessAccount acc4 = (BusinessAccount)acc2;
		//acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		//if (acc3 instanceof BusinessAccount) {
			//BusinessAccount acc5 = (BusinessAccount)acc3;
			//acc5.loan(200.0);
			//System.out.println("Loan!");
		//}
		//if (acc3 instanceof SavingsAccount) {
			//SavingsAccount acc5 = (SavingsAccount)acc3;
			//acc5.updateBalance();
			//System.out.println("Update!");
		//}	
		
		//Polimorfismo
		Account x = new Account(1020, "Junior", 1000.00);
		Account y = new SavingsAccount(1021, "Jairo", 1000.00, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.00);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
