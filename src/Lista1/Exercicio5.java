/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Velocidade do carro em km/h: ");
		float carVel = entrada.nextFloat();
		
		if (carVel > 80) {
			
			float multa = (carVel - 80) * 7;
			
			System.out.println("Você foi multado em: R$ " + multa);
		} else {
			System.out.println("Tranquilo!");
		}
		
	}

}
