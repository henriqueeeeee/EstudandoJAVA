package application;

import java.util.Locale;
import java.util.Scanner;

import bank.contaBancaria;


public class Main {
	public static void main (String[] args ) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		contaBancaria conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new contaBancaria(number, holder, initialDeposit);
		}else {
			conta = new contaBancaria(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depoisitValue = sc.nextDouble();
		conta.deposit(depoisitValue);
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		conta.withdraw(withDrawValue);
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		sc.close();
	}
}