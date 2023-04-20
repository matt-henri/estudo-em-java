package curso_programacao_01;

import java.util.Scanner;

public class Logica {
	
	void maiorMenor(int n, int m){
		if (n > m) {
			System.out.println(n + " é maior que " + m);
		}else {
			System.out.println(m + " é maior que " + n);;
		}
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Logica logica = new Logica();
		
		System.out.println("Informe um valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.println("Informe outro valor: ");
		int valor2 = entrada.nextInt();
		

		
		logica.maiorMenor(valor1, valor2);
		
		
		entrada.close();
	}

}
