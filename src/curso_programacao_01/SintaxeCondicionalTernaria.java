package curso_programacao_01;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeCondicionalTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double total;
		
		double preco = sc.nextInt();
		double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		total = preco - desconto;
		
		System.out.printf(" O valor do produto é R$ %.2f %n", preco);
		System.out.printf(" O desconto é de R$ %.2f %n %n", desconto);
		System.out.printf(" O valor do produto com desconto é de R$ %.2f", total);
		
		
		sc.close();

	}

}
