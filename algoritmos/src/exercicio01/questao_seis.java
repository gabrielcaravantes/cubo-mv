package exercicio01;

import java.util.Scanner;

public class questao_seis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		int antecessor = num - 1;
		int sucessor = num + 1;
		
		System.out.println("O número " + num + " tem como antecessor o número " + antecessor + " e como sucessor tem o numero " + sucessor);
	}

}
