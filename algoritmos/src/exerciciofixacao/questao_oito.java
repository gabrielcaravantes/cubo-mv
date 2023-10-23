package exerciciofixacao;

import java.util.Scanner;

public class questao_oito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num_funcionario;
		double hora_trabalhada, valor_hora, salario;
		
		System.out.println("Número do funcionário: ");
		num_funcionario = sc.nextInt();
		
		System.out.println("Número de horas trabalhas: ");
		hora_trabalhada = sc.nextDouble();
		
		System.out.println("Valor da hora trabalhada: ");
		valor_hora = sc.nextDouble();
		
		salario = hora_trabalhada * valor_hora;
		
		System.out.printf("Funcionário de número " + num_funcionario + " recebe um salário de %.2f%n", salario);

	}

}
