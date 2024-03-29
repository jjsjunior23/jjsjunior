package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.println("Informe a quantidade de produtos: ");
		int p = sc.nextInt();
		
		for (int i=1; i<=p; i++) {
			
			System.out.println("Produto #"+i);
			System.out.print("Comum, usado ou importado (c/u/i)");
			char t = sc.next().charAt(0);
			
			if (t != 'c' && t != 'u' && t != 'i') {
				System.out.println("Valor ivalido.");
				i -= 1;
				continue ;				
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Valor: ");
			double price = sc.nextDouble();
			
			if (t == 'c') {
				list.add(new Product(name, price));
			}
			else if (t == 'u') {
				System.out.print("Data de fabrica��o DD/MM/AAAA: ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				System.out.print("Taxa de importa��o: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			}			
		}
		System.out.println("Lista de pre�os: ");
		System.out.println();
		

		for (Product prod : list) {
			System.out.println(prod.priceTag());			
		}			
		
		sc.close();
	}

}
