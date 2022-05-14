/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	//Mostra antecessor e sucessor
	
	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
					
			System.out.println("Número: ");
			int numero = entrada.nextInt();
			
			int antecessor = numero - 1;
			int sucessor = numero + 1;
			
			System.out.println(antecessor + ", " + numero + ", " + sucessor);
	}

}
