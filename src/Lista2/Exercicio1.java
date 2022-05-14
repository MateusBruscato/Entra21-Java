/**
 * 
 */
package Lista2;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();

		double notas[] = new double[4];
		
		System.out.println("Nota 1: ");
		notas[0] = entrada.nextDouble();

		System.out.println("Nota 2: ");
		notas[1] = entrada.nextDouble();

		System.out.println("Nota 3: ");
		notas[2] = entrada.nextDouble();

		System.out.println("Nota 4: ");
		notas[3] = entrada.nextDouble();

		double media = (java.util.stream.DoubleStream.of(notas).sum()) / notas.length;

		if (media >= 7) {
				System.out.println("Aprovado!");
			} else if (media < 7 && media >= 6) {
				System.out.println("Exame!");
			} else {
			System.out.println("Reprovado");
			}
	}

}
