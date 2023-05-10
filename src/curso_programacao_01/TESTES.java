package curso_programacao_01;

import java.util.Scanner;

public class TESTES {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior número é o " + a);
		} else if (b > c) {
			System.out.println("O maior número é o " + b);
		} else {
			System.out.println("O maior número é o " + c);
		}
		
		sc.close();
		
		

	}

}
