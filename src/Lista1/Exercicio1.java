/**
 * 
 */
package Lista1;

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
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Matr�cula: ");
		int matricula = entrada.nextInt();
		
		System.out.println("Nota 1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.println("Nota 2: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2)/2;
		
		System.out.println("A m�dia do aluno " + nome + ", de matr�cula n� " + matricula + ", � " + media + ".");
	}

}
