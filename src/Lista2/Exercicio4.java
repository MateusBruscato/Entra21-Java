/**
 * 
 */
package Lista2;

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

		System.out.println("Número do empregado: ");
		long employNum = entrada.nextLong();
		
		System.out.println("Ano de nascimento: ");
		int birthY = entrada.nextInt();
		
		System.out.println("Ano de entrada na empresa: ");
		int entryY = entrada.nextInt();
		
		int workTime = 2022 - entryY;
		int age = 2022 - birthY;
		
		int minAge = 65;
		int minWork = 30;
		int condAge = 60;
		int condWork = 25;
		
		if (workTime >= minWork || age >= minAge || (age >= condAge && workTime >= condWork)) {
			System.out.println("Requerer aposentadoria!");
		} else {
			System.out.println("Não requerer!");
		}
		

	}

}
