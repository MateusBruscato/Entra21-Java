/**
 * 
 */
package MaquinaDeLavar;

import java.io.IOException;
import java.util.Scanner;



/**
 * @author guest01
 *
 */
public class MaquinaDeLavar {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	static String[] info = new String[4];
	static int[] numbers = new int[5];

	
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner entrada = new Scanner(System.in);
		entrada.useDelimiter(System.lineSeparator());
				
		do {
			System.out.println("====================================================== \n"
					+ "MENU DE SIMULAÇÃO \n" + "====================================================== \n"
					+ "1 - Configurar a máquina de lavar \n" + "2 - Simular a máquina de lavar \n" + "0 - Sair \n"
					+ "Digite o código: ");

			try {
			
			int opt = Integer.valueOf(entrada.next());
			
			switch (opt) {

			case 1:

				String[] forms = { "Modelo: ", "Nome: ", "Voltagem: (220V OU 110V OU 220/110V): ", "Quantos kg? ",
						"Duração do Estágio 1 - Lavação Pesada: ", "Duração do Estágio 2 - Lavação Normal: ",
						"Duração do Estágio 3 - Lavação Rápida: ", "Duração do Estágio 4 - Enxague: ",
						"Duração do Estágio 5 - Centrifuga: " };

				System.out.print(forms[0]);
				info[0] = entrada.next();

				System.out.print(forms[1]);
				info[1] = entrada.next();

				System.out.print(forms[2]);
				info[2] = entrada.next();

				System.out.print(forms[3]);
				info[3] = entrada.next();

				System.out.print(forms[4]);
				numbers[0] = Integer.valueOf(entrada.next());

				System.out.print(forms[5]);
				numbers[1] = Integer.valueOf(entrada.next());

				System.out.print(forms[6]);
				numbers[2] = Integer.valueOf(entrada.next());

				System.out.print(forms[7]);
				numbers[3] = Integer.valueOf(entrada.next());

				System.out.print(forms[8]);
				numbers[4] = Integer.valueOf(entrada.next());

				for (int i = 0; i < info.length; i++) {
					System.out.println(forms[i] + info[i]);
				}
				for (int i = 0; i < numbers.length; i++) {
					System.out.println(forms[i + 4] + numbers[i]);
				}
				System.out.print("\n \n");
				break;
			
			case 2:
				
				if(info[0] == null) {
					System.out.println("Favor preencher as informações da máquina!");
					break;
				}
				
				System.out.println("Simulando o Modelo: " + info[0] + " - " + info[1] + " - " + info[3] + "kg - "
						+ "Voltagem: " + info[2]);

				System.out.println("================================================================ \n"
						+ "QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR? \n"
						+ "================================================================\n");
				System.out.println("1 - Lavação Pesada \n" + "2 - Lavação Normal \n" + "3 - Lavação Leve \n"
						+ "4 - Enxague \n" + "5 - Centrifugar \n" + "Selecione o estágio inicial:");
				int opt2 = Integer.valueOf(entrada.next());

				switch (opt2) {

				case 1:
					for (int i = 0; i < 5; i++) {
						Thread.sleep((numbers[0]*1000)/5);
						System.out.println("Estágio 1 - Em Lavação Pesada: " + 20 * (i + 1) + "%");
					}
					System.out.print("\n");
				case 2:
					for (int i = 0; i < 5; i++) {
						Thread.sleep(500);
						System.out.println("Estágio 2 - Lavação Normal: " + 20 * (i + 1) + "%");
					}
					System.out.print("\n");

				case 3:
					for (int i = 0; i < 5; i++) {
						Thread.sleep(500);
						System.out.println("Estágio 3 - Lavação Leve: " + 20 * (i + 1) + "%");
					}
					System.out.print("\n");

				case 4:
					for (int i = 0; i < 5; i++) {
						Thread.sleep(500);
						System.out.println("Estágio 4 - Enxague: " + 20 * (i + 1) + "%");
					}
					System.out.print("\n");

				case 5:
					for (int i = 0; i < 5; i++) {
						Thread.sleep(500);
						System.out.println("Estágio 5 - Centrifugar: " + 20 * (i + 1) + "%");
					}
					System.out.print("\n");
					System.out.println("Ciclo Concluído!");
				}
				break;
			case 0:
				System.out.println("Saiu!");
				return;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			} catch(NumberFormatException e) {
				System.out.println("Escolhe entre 0, 1 e 2. \n");
			}
		} while (true);

	}
}
