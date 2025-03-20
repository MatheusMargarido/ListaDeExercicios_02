package application;

import java.util.Scanner;
import entities.Calculadora;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            try {
                System.out.println("[  Calculo salario total  ]");
                System.out.print("Informe o salario fixo: ");
                double salarioFixo = sc.nextDouble();

                System.out.print("Informe o valor das vendas realizadas no mes: ");
                double vendaMensais = sc.nextDouble();

                System.out.print("Porcentagem ganha nas vendas mensais: ");
                double porcentagemVendasMensais = sc.nextDouble();

                double salarioTotal = Calculadora.salarioTotal(salarioFixo, vendaMensais, porcentagemVendasMensais);
                System.out.printf("Salario total: R$ %.2f%n", salarioTotal);

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
