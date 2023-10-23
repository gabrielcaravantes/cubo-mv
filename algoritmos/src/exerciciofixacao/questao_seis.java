package exerciciofixacao;

import java.util.Scanner;

public class questao_seis {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Terceira nota: ");
		nota3 = sc.nextDouble();
		
		System.out.println("Quarta nota: ");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if(media >= 7) {
			System.out.println("O aluno esta aprovado com a média de " + media);
		}else if(media < 4){
			System.out.println("O aluno esta reprovado com a média de " + media);
		}else {
			System.out.println("O aluno esta de recuperação com a média de " + media);
		}

	}

}
