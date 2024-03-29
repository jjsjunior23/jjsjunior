package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Informe o n�mero de empregados: ");
		
		int n = sc.nextInt();
		
		for (int i=1; i<=5; i++) {
			
			System.out.println("Dados do Empregado #" + i);
			System.out.print("Terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
			if (ch == 's') {
				System.out.print("Taxa adicional: ");
				double taxaAdicional = sc.nextDouble(); 
				list.add(new OutsourcedEmployee(nome, horas, valorHora, taxaAdicional));
			}
			else {
				list.add(new Employee(nome, horas, valorHora));				
			}
		}	
		
		System.out.println();
		System.out.println("Pagamentos:");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}

}
