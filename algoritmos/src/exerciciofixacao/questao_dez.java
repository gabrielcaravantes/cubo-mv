package exerciciofixacao;

import java.util.Scanner;

public class questao_dez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade, dia, mes, ano;
		
		System.out.println("Digite sua idade em dias: ");
		idade = sc.nextInt();
		
		
		ano = idade / 365;
		idade %= 365;
		mes = idade / 30;
		idade %= 30;
		dia = idade;
		
		System.out.println("Você viveu por " + ano + " anos, " + mes + " meses e " + dia + " dias");

	}

}
