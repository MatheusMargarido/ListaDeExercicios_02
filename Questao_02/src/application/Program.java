package application;
import java.util.Scanner;
import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;

		try {
			while (continua) {
				System.out.println("[Calculo valor do produto]");
				System.out.print("Informe o valor do produto: ");
				double valorProduto = sc.nextDouble();
				System.out.printf("Novo valor do produto: R$ %.2f\n" , Calculadora.CalculoJuros(valorProduto));
				System.out.print("Deseja calcular um novo valor? [S][N]: ");
				char resposta = sc.next().toUpperCase().charAt(0);
				
				if(resposta == 'N') {
					continua = false;
					System.out.println("FIM DO PROGRAMA");
				}
			}

		} catch (Exception e) {
			System.out.println("Dado invalido !!");
			sc.nextLine();
		}

		sc.close();
	}

}
