package exerciciofixacao;

import java.util.Scanner;

public class questao_sete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod_p1, cod_p2, num_p1, num_p2;
		double valor_p1, valor_p2, total_p1, total_p2, total;
		
		System.out.println("Digite o código da peça 1: ");
		cod_p1 = sc.nextInt();
		
		System.out.println("Digite o número da(s) peça(s) 1:");
		num_p1 = sc.nextInt();
		
		System.out.println("Digite o preço da peça 1: ");
		valor_p1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		cod_p2 = sc.nextInt();
		
		System.out.println("Digite o número da(s) peça(s) 2:");
		num_p2 = sc.nextInt();
		
		System.out.println("Digite o preço da peça 2: ");
		valor_p2 = sc.nextDouble();
		
		total_p1 = num_p1 * valor_p1;
		total_p2 = num_p2 * valor_p2;
		total = total_p1 + total_p2;
		
		System.out.println("Valor a ser pago: R$ " + total);

	}

}
