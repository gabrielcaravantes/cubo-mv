package exercicio01;

import java.util.Scanner;

public class questao_quatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod_peca1, quantia_peca1, cod_peca2, quantia_peca2;
		double ipi, valor_peca1, valor_peca2;
		
		System.out.println("Informe a porcentagem do IPI a ser acrescida: ");
		ipi = sc.nextDouble();
		
		System.out.println("Informe o código da peça 1: ");
		cod_peca1 = sc.nextInt();
		
		System.out.println("Informe a quantidade da(s) peça(s) 1: ");
		quantia_peca1 = sc.nextInt();
		
		System.out.println("Informe o preço da peça 1: ");
		valor_peca1 = sc.nextDouble();
		
		System.out.println("Informe o código da peça 2: ");
		cod_peca2 = sc.nextInt();
		
		System.out.println("Informe a quantidade da(s) peça(s) 2: ");
		quantia_peca2 = sc.nextInt();
		
		System.out.println("Informe o preço da peça 2: ");
		valor_peca2 = sc.nextDouble();
		
		double valor_total = (quantia_peca1 * valor_peca1 + quantia_peca2 * valor_peca2) + ipi/100 + 1;
		
		System.out.println("O valor total a ser pago é: R$" + valor_total);
		
				
	}

}
