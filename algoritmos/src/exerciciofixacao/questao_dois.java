package exerciciofixacao;

import java.util.Scanner;

public class questao_dois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, PROD;
		
		System.out.println("Valor 1: ");
		valor1 = sc.nextInt();
		
		System.out.println("Valor 2: ");
		valor2 = sc.nextInt();
		
		PROD = valor1 * valor2;
		
		System.out.println("O produto dos valores 1 e 2 é: " + PROD);

	}

}
