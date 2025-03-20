package application;
import java.util.Scanner;
import entities.Calculadora;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {
			
			try {
				System.out.println("[ Calculo de Juros Compostos ]");
				System.out.print("Digite o capital inicial: ");
				double capitalInicial = sc.nextDouble();
				System.out.print("Digite o tempo de aplicação [Mes]: ");
				int tempoAplicacao = sc.nextInt();
				System.out.print("Informe a porcentagem dos juros mensais: ");
				double juros = sc.nextDouble() / 100;

				double montante = Calculadora.calculoJuros(capitalInicial, tempoAplicacao, juros);
				System.out.printf("Montante a ser recebido: R$ %.2f%n", montante);

				System.out.print("Deseja simular novamente? [S/N]: ");
				char resposta = sc.next().toUpperCase().charAt(0);

				if (resposta == 'N') {
					System.out.println("FIM DO PROGRAMA");
					continuar = false;
				}

			} catch (Exception e) {
				System.out.println("Erro: Entrada de dados inválida!");
				sc.nextLine();
			}
		}

		sc.close();
	}
}
