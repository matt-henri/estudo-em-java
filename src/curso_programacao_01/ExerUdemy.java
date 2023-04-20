package curso_programacao_01;

import java.util.Scanner;

public class ExerUdemy {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a largura do terreno: ");
		int largura = entrada.nextInt();
		
		System.out.println("informe o comprimento do terreno: ");
		int comprimento = entrada.nextInt();
		
		System.out.println("informe o valor do metro quadrado: ");
		int valorMetroQuadrado = entrada.nextInt();
		
		
		int area = (largura * comprimento);
		System.out.println("A area desse terreno pe de: " + area);
		
		
		int preco = (area * valorMetroQuadrado);
		System.out.println("O preço do terreno é de: " + preco);

		entrada.close();
	}

}
