package curso_programacao_01;

import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {


		
Scanner sc = new Scanner(System.in);
		
		System.out.println("digite algo: ");
		
		String entrada = sc.nextLine();
		String s01 = entrada.toLowerCase();
		String s02 = entrada.toUpperCase();
		String s03 = entrada.substring(2, 9);
		
		System.out.println("toLowerCase:  " + s01);
		System.out.println("toUpperCase:  " + s02);
		System.out.println("Substring:  " + s03);
		
		
		
		sc.close();

	}

}
