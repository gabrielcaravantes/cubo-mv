package exerciciofixacao;

import java.util.Scanner;

public class questao_cinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("O aluno esta aprovado com a média " + media);
		}else {
			System.out.println("O aluno esta reprovado com a média " + media);
		}	

	}

}
