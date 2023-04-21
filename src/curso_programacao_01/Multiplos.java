package curso_programacao_01;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não são Multiplos");
		}
		
		entrada.close();

	}

}
