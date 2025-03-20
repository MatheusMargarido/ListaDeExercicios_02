package application;
import java.util.Scanner;
import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;

		while (continua) {
			try {

				System.out.println("[  Media Aritmerica | Media Harmonica | Media Geometrica  ]");

				System.out.print("Digite o 1° valor: ");
				double n1 = sc.nextDouble();
				System.out.print("Digite o 2° valor: ");
				double n2 = sc.nextDouble();
				System.out.print("Digite o 3° valor: ");
				double n3 = sc.nextDouble();

				System.out.printf("Média Aritmética: %.2f%n", Calculadora.mediaAritmetica(n1, n2, n3));
				System.out.printf("Média Harmônica: %.2f%n", Calculadora.mediaHarmonica(n1, n2, n3));
				System.out.printf("Média Geométrica: %.2f%n", Calculadora.mediaGeometrica(n1, n2, n3));

				System.out.print("Deseja calcular novamente? [S][N]: ");
				char resposta = sc.next().toUpperCase().charAt(0);

				if (resposta == 'N') {
					continua = false;
					System.out.println("FIM DO PROGRAMA");
				} else {
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("Erro: entrada de dados inválida! Tente novamente.");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
