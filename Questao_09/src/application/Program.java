package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;

		while (continua) {
			try {
				
				System.out.print("Digite a quantidade de segundos: ");
				int totalSegundos = sc.nextInt();

				int horas = totalSegundos / 3600;
				int minutos = (totalSegundos % 3600) / 60;
				int segundos = totalSegundos % 60;

				System.out.printf("Tempo equivalente: %02d:%02d:%02d%n", horas, minutos, segundos);
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
