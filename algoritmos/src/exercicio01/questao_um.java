package exercicio01;

import java.util.Scanner;

public class questao_um {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano, mes, dia, idade;
		
		System.out.println("Digite o número de anos: ");
		ano = sc.nextInt();
		
		System.out.println("Digite o número de meses: ");
		mes = sc.nextInt();
		
		System.out.println("Digite o número de dias: ");
		dia = sc.nextInt();
		
		idade = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("A idade em dias é: " + idade);

	}

}
