/**
 * 
 */
package Lista1;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = entrada.nextLine();

		System.out.println("Nota 1: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Nota 2: ");
		double nota2 = entrada.nextDouble();

		System.out.println("Frequência: ");
		double freq = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (freq > 70 && media >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado");
		}
	}

}
