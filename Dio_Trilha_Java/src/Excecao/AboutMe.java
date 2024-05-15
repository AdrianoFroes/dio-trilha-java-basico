package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		try {		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = s.next();
		
		System.out.println("Digite seu sobre nome ");
		String sobreNome = s.next();
		
		System.out.println("Digite sua idade ");
		int idade = s.nextInt();
		
		System.out.println("Digite sua altura ");
		double altura = s.nextDouble();
		
		System.out.println("Ola, me chamo " + nome.toUpperCase()+ " " + sobreNome);
		System.out.println("Tenho " + idade + "anos ");
		System.out.println("Minha altura é " + altura + "cm");
		
		s.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Os campos idade e alutra precisam ser numericos ");
		}

	}

}
