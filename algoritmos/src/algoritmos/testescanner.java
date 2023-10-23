package algoritmos;

import java.util.Scanner;

public class testescanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int anoNasc, anoAtual, idade;
		String nome;
		
		System.out.println("Qual o seu nome?");
		nome = sc.nextLine();
		
		System.out.println("Que ano esta?");
		anoAtual = sc.nextInt();
		
		System.out.println("Qual seu ano de nascimento?");
		anoNasc = sc.nextInt();
		
		idade = anoAtual - anoNasc;
		
		if(idade >= 18) {
			System.out.println("Meu nome é " + nome + " tenho " + idade + " anos, nasci em " + anoNasc + " e estou apto para tirar carteira");
		}else {
			System.out.println("Meu nome é " + nome + " tenho " + idade + " anos, nasci em " + anoNasc + " e não estou apto para tirar carteira");
		}

	}

}
