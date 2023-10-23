package exerciciofixacao;

import java.util.Scanner;

public class questao_nove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario_fixo, vendas, comissao, salario_final;
		
		System.out.println("Nome do vendedor: ");
		nome = sc.nextLine();
		
		System.out.println("Salário fixo: ");
		salario_fixo = sc.nextDouble();
		
		System.out.println("Total de vendas em dinheiro: ");
		vendas = sc.nextDouble();
		
		comissao = (vendas * 15) / 100;
		salario_final = salario_fixo + comissao;
		
		System.out.printf(nome + " receberá um salário de %.2f%n", salario_final);

	}

}
