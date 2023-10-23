package algoritmos;

public class carteira {

	public static void main(String[] args) {
		int anoNasc = 2004, anoAtual = 2023, idade;
		
		idade = anoAtual - anoNasc;
		
		if(idade >= 18){
			System.out.println("Você esta apto para tirar a carteira de motorista");
		}else {
			System.out.println("Você esta inapto a tirar a carteira de motorista");
		};

	}

}
