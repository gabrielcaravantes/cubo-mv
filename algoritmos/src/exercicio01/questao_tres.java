package exercicio01;

import java.util.Scanner;

public class questao_tres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo;
		
		System.out.println("Informe seu saldo: ");
		saldo = sc.nextDouble();
		
		double reajuste = saldo + (saldo * 1) / 100;
		
		System.out.println("O saldo com reajuste fica: R$ " + reajuste);		
		
	}

}
