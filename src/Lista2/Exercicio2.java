/**
 * 
 */
package Lista2;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Conta: ");
		int account = entrada.nextInt();
		
		System.out.println("Saldo: ");
		double balance = entrada.nextDouble();
		
		System.out.println("Débito: ");
		double debit = entrada.nextDouble();
		
		System.out.println("Crédito: ");
		double credit = entrada.nextDouble();
		
		double curBal = balance - debit + credit;
		
		if (curBal >= 0) {
			System.out.println("Saldo Positivo de: R$ " + curBal);
		} else {
			System.out.println("Saldo Negativo de: R$ " + (curBal * (-1)));
		}
		
	}

}
