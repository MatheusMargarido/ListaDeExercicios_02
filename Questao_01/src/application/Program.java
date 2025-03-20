package application;
import java.util.Scanner;
import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		
		while (continua) {
			try {

				System.out.println("[Média Aritmética de dois numeros]");

				System.out.print("1° Numero: ");
				double n1 = sc.nextDouble();
				System.out.print("2° Numero: ");
				double n2 = sc.nextDouble();
				System.out.println("A media dos dois numeros apresentados é: " + Calculadora.calculoMedia(n1, n2));
				System.out.print("Deseja continuar? [S][N]: ");
				char resposta = sc.next().toUpperCase().charAt(0);

				if (resposta == 'N') {
					continua = false;
					System.out.println("FIM DO PROGRAMA");
				}

			} catch (Exception e) {
				System.out.println("Erro Entrada de dados invalida !!");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
