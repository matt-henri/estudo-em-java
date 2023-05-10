package curso_programacao_01;

import java.util.Scanner;

public class ExerFOR02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Seu nome é: " + nome);
		
		sc.close();
	}

}
