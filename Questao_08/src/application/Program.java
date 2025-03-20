package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;

		while (continua) {
			try {

				System.out.println("[  Estacionamento  ]");

				System.out.print("Total de Veiculos: ");
				int totalVeiculos = sc.nextInt();
				System.out.print("Total de Rodas: ");
				int totalRodas = sc.nextInt();

				if (totalRodas < 2 * totalVeiculos || totalRodas > 4 * totalVeiculos) {
					System.out.println("Dados inconsistentes! Verifique os valores informados.");
				} else {
					int motos = (4 * totalVeiculos - totalRodas) / 2;
					int carros = totalVeiculos - motos;

					System.out.println("Quantidade de carros: " + carros);
					System.out.println("Quantidade de motos: " + motos);
				}
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
