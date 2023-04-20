package curso_programacao_01;

import java.util.Scanner;


public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o primeiro numero para soma: ");
		int valor1 = entrada.nextInt();
		
		System.out.println("informe o segundo numero para soma:");
		int valor2 = entrada.nextInt();
		
		System.out.println("informe o terceiro numero para soma:");
		int valor3 = entrada.nextInt();
		
		int soma = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("a média dos tres numeros é " + soma);
		
		entrada.close();
	}

}
