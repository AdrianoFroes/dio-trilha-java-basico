package Controle_Fluxo;

import java.util.Iterator;

public class ExemploFor {

	public static void main(String[] args) {
		
		for (int carneiro = 1; carneiro <=20; carneiro ++) {
			System.out.println("Contando carneiros " + carneiro);
			
		}
		
		for(int n = 0; n <= 10;  n++ ) {
			if(n % 2 == 0) {
				System.out.println("O numero: " + n + " é PAR: ");
			}else {
				System.out.println("O numero: " + n + " é IMPAR: ");
			}
		}
	

	}

}
