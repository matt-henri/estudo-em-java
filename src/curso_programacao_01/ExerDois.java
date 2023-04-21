package curso_programacao_01;

import java.util.Scanner;

public class ExerDois {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numUm = entrada.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		int numDois = entrada.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		int numTres = entrada.nextInt();
		
		if (numUm >= 0) {
			System.out.println("O primeiro número é positivo");
		} else {
			System.out.println("O primeiro número é negativo");
		}
		
		if (numDois >= 0) {
			System.out.println("O segundo número é positivo");
		} else {
			System.out.println("O segundo número é negativo");
		}
		
		if (numTres >= 0) {
			System.out.println("O terceiro número é positivo");
		} else {
			System.out.println("O terceiro número é negativo");
		}
		
		
		
		
		entrada.close();

	}

}
