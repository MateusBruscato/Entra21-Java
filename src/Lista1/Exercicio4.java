/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("M�dia 1: ");
		float media1 = entrada.nextFloat();
		
		System.out.println("M�dia 2: ");
		float media2 = entrada.nextFloat();
		
		float mediaFinal = (media1 + media2) / 2;
		
		System.out.println("M�dia Final: " + mediaFinal);
	}

}
