package curso_programacao_01;

import java.util.Scanner;

public class SenhaDeAcesso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while( senha != 2395) {
			System.out.println("Senha Inválida");
		
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		
		
		sc.close();

	}

}
