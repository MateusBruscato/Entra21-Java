/**
 * 
 */
package Lista1;

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
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Número: ");
		float numero = entrada.nextFloat();
		
		float dobro = numero * 2;
		float triplo = numero * 3;
		
		System.out.println("Dobro: " + dobro + "\n" + "Triplo: " + triplo);
	}

}
