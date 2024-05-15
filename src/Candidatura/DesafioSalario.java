package Candidatura;

import java.util.Scanner;

public class DesafioSalario {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float valorSalario = s.nextFloat();
		float valorBeneficio = s.nextFloat();

		float valorImposto = 0;

		if (valorSalario >= 0 && valorSalario <= 1100) {
			valorImposto = 0.5F * valorSalario;
			
		}else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
			valorImposto = 0.10F * valorSalario;
		
		}else {
			valorImposto = 0.15F * valorSalario;
		}

		float saida = valorSalario - valorImposto + valorBeneficio;
		System.out.println(String.format("%2.f", saida));

		s.close();
	}

}
