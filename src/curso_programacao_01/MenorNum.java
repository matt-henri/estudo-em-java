package curso_programacao_01;

import java.util.Scanner;

public class MenorNum {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		if (a < b && a < c) {
			System.out.println("Menor = " + a);
		} else if ( b < c) {
			System.out.println("Menor = " + b);
		} else {
			System.out.println("Menor = " + c);
		}
		
		
		entrada.close();
	}

}
