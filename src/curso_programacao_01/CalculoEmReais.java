package curso_programacao_01;

import java.util.Locale;
import java.util.Scanner;

public class CalculoEmReais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100) * 2;
		  //conta = conta += (...);
		}
		
		System.out.printf("Valor da conta de telefone = R$ %.2f%n", conta);
		
		sc.close();

	}

}
