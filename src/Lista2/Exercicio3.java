/**
 * 
 */
package Lista2;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos kg de maçã você quer?");
		double qApple = entrada.nextDouble();
		
		System.out.println("Quantos kg de morango você quer?");
		double qStraw = entrada.nextDouble();
		
		double pApple;
		double pStraw;
		
		if (qApple > 5) {
			pApple = qApple * 1.5;
		} else {
			pApple = qApple * 1.8;
		}
		
		if (qStraw > 5) {
			pStraw = qStraw * 2.2;
		} else {
			pStraw = qStraw * 2.5;
		}
		
		double totalPrice = pApple + pStraw;
		
		if (qApple + qStraw > 8 || totalPrice > 25)
		{
			totalPrice = totalPrice * 0.9;
			System.out.println("O valor total a pagar é de: R$ " + totalPrice);
		} else {
			System.out.println("O valor total a pagar é de: R$ " + totalPrice);
		}
		
	}

}
