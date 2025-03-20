package application;
import java.util.Scanner;
import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;

		while (continua) {
			try {
				System.out.println("[  Calculo salário bruto  ]");
				System.out.print("Informe as horas trabalhadas no Mes: ");
				double horasTrabalhadas = sc.nextDouble();
				System.out.print("Valor por horas trabalhadas: ");
				double valorHorasTrabalhadas = sc.nextDouble();
				System.out.print("Valor do Salario Familia: ");
				double salarioFamilia = sc.nextDouble();
				System.out.print("Numero de filhos menor que 14 anos: ");
				int numeroFilhos = sc.nextInt();

				System.out.printf("Salario bruto a receber: R$%.2f\n", Calculadora.calculoSalarioBruto(horasTrabalhadas,
						valorHorasTrabalhadas, salarioFamilia, numeroFilhos));

				System.out.print("Deseja calcular novamente?: [S][N]: ");
				char resposta = sc.next().toUpperCase().charAt(0);

				if (resposta == 'N') {
					continua = false;
					System.out.println("FIM DO PROGRAMA");
				} else {
					System.out.println();
				}

			} catch (Exception e) {
				System.out.println("Erro: entrada de dado invalida !!");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
