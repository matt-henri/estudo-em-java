package curso_programacao_01;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int valor1 = entrada.nextInt();

		System.out.println("Informe o primeiro número: ");
		int valor2 = entrada.nextInt();
		
		System.out.println("Informe o primeiro número: ");
		int valor3 = entrada.nextInt();
		
		if (valor1 >= 0) {
			System.out.println("o primeiro numero é par");
		} else { 
			System.out.println("o primeiro numero é impar");
		}
		
		if (valor2 >= 0) {
			System.out.println("o segundo numero é par");
		} else { 
			System.out.println("o segundo numero é impar");
		}
		
		if (valor3 >= 0) {
			System.out.println("o terceiro numero é par");
		} else { 
			System.out.println("o terceiro numero é impar");
		}
		
		entrada.close();

	}

}
