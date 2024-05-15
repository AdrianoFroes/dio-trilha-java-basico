package Candidatura;

import java.util.Scanner;

public class SimulacaoBancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;
		// Loop infinito para manter o programa em execução até que o usuário decida
		// sair
		while (true) {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("1 - Deposito: ");
			System.out.println("2 - Saque ");
			System.out.println("3 - Consultar Saldo ");
			System.out.println("4 - Sair ");

			int opcao = scanner.nextInt();
			// TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
			// Dica: Utilze o switch/case para o programa realizar as operações escolhidas
			// pelo usuário.
			switch (opcao) {
			case 1:
				// Depósito
				System.out.print("Informe o valor do depósito: ");
				double valorDeposito = scanner.nextDouble();
				saldo += valorDeposito;
				System.out.println("Depósito de R$ " + valorDeposito + " realizado com sucesso.");
				break;
			case 2:
				// Saque
				System.out.print("Informe o valor do saque: ");
				double valorSaque = scanner.nextDouble();
				if (valorSaque <= saldo) {
					saldo -= valorSaque;
					System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso.");
				} else {
					System.out.println("Saldo insuficiente para realizar o saque.");
				}
				break;
			case 3:
				// Consultar saldo
				System.out.println("Saldo atual: R$ " + saldo);
				break;
			case 4:
				// Sair
				System.out.println("Saindo...");
				System.exit(0);
				// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
			default:
				System.out.println("Opção inválida. Tente novamente.");

			}
		}
	}
}