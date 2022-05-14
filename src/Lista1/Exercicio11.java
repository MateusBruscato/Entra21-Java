/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Número 2: ");
		double num2 = entrada.nextDouble();
		
		double sum = num1 + num2;
		
		System.out.println("Soma: " + sum);
	}

}
