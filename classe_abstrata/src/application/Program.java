package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new Account(1001, "Junior", 1000.0));
		list.add(new SavingsAccount(1002, "Jairo", 1000.0, 0.01));
		list.add(new BusinessAccount(1003, "José", 1000.0, 500.0));
		
		double sum = 0.0;
		
		for (Account acc : list ) {
			sum += acc.getBalance();
		}
		System.out.printf("Saldo total inicial: %.2f%n", sum);		
		
		for (Account acc : list ) {
			acc.deposit(10.0);	
		}
		for (Account acc : list ) {
			System.out.printf("Saldo atualizado para conta %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		sum = 0.0;
		for (Account acc : list ) {
			sum += acc.getBalance();
		}
		System.out.printf("Saldo total final: %.2f%n", sum);	
		
	}

}
