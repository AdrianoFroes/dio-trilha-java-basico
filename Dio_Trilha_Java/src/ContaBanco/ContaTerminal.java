/**
 * 
 */
package ContaBanco;

import java.util.Scanner;

/**
 * 
 */
public class ContaTerminal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o numero da Conta: ");
		int numeroConta = s.nextInt();
		
		System.out.println("Digite o numero da Agencia: ");
		String agencia = s.next();
		
	    System.out.println("Digite o nome titular da conta: ");
	    String nomeCliente = s.next();
	    
	    System.out.println("Digite o valor do Saldo: ");
	    double saldo = s.nextDouble();
	    
	    System.out.println("Ola " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua Agencia é " + agencia + " Conta "
	    + numeroConta + " e seu Saldo é " + saldo );
				
		
		s.close();

	}

}
