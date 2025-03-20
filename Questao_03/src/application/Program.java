package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		boolean continua = true;
		Scanner sc = new Scanner(System.in);
		while (continua) {
			try {

				System.out.println("[ Fahrenheit para Graus Centígrados. ]");
				System.out.print("Informe a temperatura em Fahrenheit: ");
				double temperaturaFahrenheit = sc.nextDouble();
				System.out.printf("A temperatura em Graus Centígrados:   %.1f°\n", (temperaturaFahrenheit - 32) / 1.8);
				System.out.print("Deseja calcular novamente?: [S][N]: ");
				char resposta = sc.next().toUpperCase().charAt(0);

				if (resposta == 'N') {
					System.out.println("FIM DO PROGRAMA");
					continua = false;
				}

			} catch (Exception e) {
				System.out.println("Entrada de dados invalida !!");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
