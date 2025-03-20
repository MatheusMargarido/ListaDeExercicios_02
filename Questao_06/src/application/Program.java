package application;

import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;

		try {
			while (continua) {
				System.out.println("[ Calculo de Logaritmo ]");
				System.out.print("Digite o número: ");
				double numero = sc.nextDouble();
				System.out.print("Digite a base: ");
				double base = sc.nextDouble();

				if (numero <= 0 || base <= 0 || base == 1) {
					System.out.println("Erro: O número e a base devem ser positivos e a base diferente de 1.");
				} else {
					double resultado = Calculadora.calculoLogaritmo(numero, base);
					System.out.printf("Logaritmo de %.2f na base %.2f é: %.2f%n", numero, base, resultado);
				}
				System.out.print("Deseja calcular novamente?: [S][N]: ");
				char resposta = sc.next().toUpperCase().charAt(0);

				if (resposta == 'N') {
					continua = false;
					System.out.println("FIM DO PROGRAMA");
				} else {
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: entrada de dado invalida !! ");
		}
		sc.close();
	}
}
