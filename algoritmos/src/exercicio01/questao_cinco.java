package exercicio01;

import java.util.Scanner;

public class questao_cinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, conversao_sm, salario_min = 1320.00;
		
		System.out.println("Informe o salário: ");
		salario = sc.nextDouble();
		
		conversao_sm = salario / salario_min;
		
		System.out.println("Você recebe " + conversao_sm + " salários mínimos");

	}

}
