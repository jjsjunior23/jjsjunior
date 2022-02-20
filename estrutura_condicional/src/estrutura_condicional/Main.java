package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Seta default de localização
		Locale.setDefault(Locale.US);
		
		//Cria nova entrada de tela
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100 ) {
			conta += (minutos - 100) * 2;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();

	}

}
