package Debbunging;

import java.util.Scanner;

public class CalculadoraDeMedias {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] alunos = {"Camila ", "Lucas ", "Bruna ", "Pedro "};
		
		
		double media = calculadoraMediaDaTurma(alunos,s);
		
		System.out.printf("Media da turma %.1f", media);
			
		s.close();

	}
	public static double calculadoraMediaDaTurma(String[] alunos,Scanner scanner ) {
		
	
		double soma = 0;
		for(String aluno : alunos) {
			System.out.printf("Nota do alunos %s", aluno);
			double nota = scanner.nextDouble();
			soma += nota;
		}
		
		return soma / alunos.length;
	}

}
