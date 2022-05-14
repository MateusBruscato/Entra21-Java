/**
 * 
 */
package Desafio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mateu
 *
 */
public class Desafio {

	private static final String ArrayI = null;

	static Scanner entrada = new Scanner(System.in);

	static ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();

	static ArrayList<ArrayList<String>> quartos = new ArrayList<ArrayList<String>>();

	static ArrayList<ArrayList<String>> check = new ArrayList<ArrayList<String>>();

	static String menu = "Sistema de Gestão de Hotel \n\n" + "1 - Cadastrar Cliente \n"
			+ "2 - Editar ou exlcuir cliente \n" + "3 - Cadastrar Quarto \n" + "4 - Editar Cadastro de Quarto \n"
			+ "5 - Checar Quartos Disponíveis \n" + "6 - Realizar Check-In \n" + "7 - Realizar Check-Out \n"
			+ "0 - Sair \n";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice;
		int costmNumb = 0;
		int roomNumb = 0;
		int checkCount = 0;

		do {
			System.out.println(menu);
			choice = Integer.valueOf(entrada.next());

			switch (choice) {
			// Cadastrar clientes

			case 1:

				entrada.useDelimiter(System.lineSeparator());

				System.out.println("Nome: ");
				matrix.add(new ArrayList<String>());
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("Data de nascimento: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("E-mail: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("Telefone: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("Cidade: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("UF: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("Fumante? ");
				matrix.get(costmNumb).add(entrada.next());

				while (!matrix.get(costmNumb).get(6).equals("S") && !matrix.get(costmNumb).get(6).equals("N")) {
					System.out.println("Responda somente com S ou N.");
					matrix.get(costmNumb).set(6, entrada.next());
				}

				costmNumb++;
				break;

			case 2:

				try {

					int ans;

					System.out.println("Qual cliente você gostaria de editar/excluir?");
					int costmCode = Integer.valueOf(entrada.next());

					System.out.println("Você gostaria de editar/excluir o cliente: " + matrix.get(costmCode).get(0)
							+ "? \n" + " 1 - Sim \n" + "2 - Não");
					ans = Integer.valueOf(entrada.next());

					do {
						switch (ans) {
						case 1:
							System.out.println("Você gostaria de: \n" + "1 - Excluir o cadastro do cliente \n"
									+ "2 - Editar o cadastro do cliente \n" + "3 - Retornar para o menu de edição");
							int edit = Integer.valueOf(entrada.next());

							if (edit == 1) {
								System.out.println("Tem certeza que gostaria de exlcuir o cadastro do cliente "
										+ matrix.get(costmCode).get(0) + "?\n" + " 1 - Sim \n" + "2 - Não");
								int sure = Integer.valueOf(entrada.next());

								if (sure == 1) {
									matrix.remove(costmCode);
									System.out.println("Removido com sucesso!");
									break;
								}
							} else if (edit == 2) {
								System.out.println("Qual informação você gostaria de editar?" + "1 - Nome \n"
										+ "2 - Data de nascimento\n" + "3 - E-mail \n" + "4 - Telefone \n"
										+ "5 - Cidade \n" + "6 - UF" + "7 - Fumante");
								int ans2 = Integer.valueOf(entrada.next());
								matrix.get(costmCode).set((ans2 - 1), entrada.next());

							} else {
								break;
							}

						case 2:
							break;
						}

					} while (ans != 1 && ans != 2);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Este cliente não existe!");
					break;
				}
				break;

			case 3:

				System.out.println("Nome: ");
				quartos.add(new ArrayList<String>());
				quartos.get(roomNumb).add(entrada.next());

				System.out.println("Posição: ");
				quartos.get(roomNumb).add(entrada.next());

				System.out.println("Aceita fumante? ");
				quartos.get(roomNumb).add(entrada.next());

				while (!quartos.get(roomNumb).get(2).equals("S") && !quartos.get(roomNumb).get(2).equals("N")) {
					System.out.println("Responda somente com S ou N.");
					quartos.get(roomNumb).set(2, entrada.next());
				}

				System.out.println("Valor da diária: ");
				quartos.get(roomNumb).add(entrada.next());

				System.out.println("Número de quartos: ");
				quartos.get(roomNumb).add(entrada.next());

				System.out.println("Disponibilidade de pessoas por quarto:  ");
				quartos.get(roomNumb).add(entrada.next());
				
				roomNumb++;
				break;
			case 4:
				
				try {

					int ans;

					System.out.println("Qual quarto você gostaria de editar/excluir?");
					int roomCode = Integer.valueOf(entrada.next());

					System.out.println("Você gostaria de editar/excluir o cliente: " + quartos.get(roomCode).get(0)
							+ "? \n" + " 1 - Sim \n" + "2 - Não");
					ans = Integer.valueOf(entrada.next());

					do {
						switch (ans) {
						case 1:
							System.out.println("Você gostaria de: \n" + "1 - Excluir o quarto \n"
									+ "2 - Editar as informações do quarto \n" + "3 - Retornar para o menu de edição");
							int edit = Integer.valueOf(entrada.next());

							if (edit == 1) {
								System.out.println("Tem certeza que gostaria de exlcuir o quarto "
										+ quartos.get(roomCode).get(0) + "?\n" + " 1 - Sim \n" + "2 - Não");
								int sure = Integer.valueOf(entrada.next());

								if (sure == 1) {
									quartos.remove(roomCode);
									System.out.println("Removido com sucesso!");
									break;
								}
							} else if (edit == 2) {
								System.out.println("Qual informação você gostaria de editar?" + "1 - Número \n"
										+ "2 - Posição \n" + "3 - Aceita fumante \n" + "4 - Valor da diária \n"
										+ "5 - Número de quartos \n" + "6 - Disponibilidade de pessoas por quarto");
								int ans2 = Integer.valueOf(entrada.next());
								quartos.get(roomCode).set((ans2 - 1), entrada.next());

							} else {
								break;
							}

						case 2:
							break;
						}

					} while (ans != 1 && ans != 2);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Este quarto não existe!");
					break;
				}
				break;

			case 5: 
				
				for (int i = 0; i < quartos.size(); i++) {
					System.out.println(quartos.get(i).get(0));
				}
				
				break;
			case 6:
				
				
				System.out.println("Qual o código do cliente que gostaria de fazer Check-In?");
				int costumer = Integer.valueOf(entrada.next());
			
				System.out.println("Cliente: " + matrix.get(costumer).get(0) + ". Deseja continuar? \n" + " 1 - Sim \n" + "2 - Não");
				int ans = Integer.valueOf(entrada.next());
				
				if (ans == 1) {
					check.add(new ArrayList<String>());

					check.get(checkCount).add(Integer.toString(costumer));
					
					System.out.println("Qual quarto o cliente " + matrix.get(costumer).get(0) + "deseja fazer check in?" );
					int room = Integer.valueOf(entrada.next());
					
					for (int i = 0; i < quartos.size(); i++) {
						if ( room == Integer.valueOf(quartos.get(i).get(0))) {
							System.out.println("Este quarto já está ocupado!");
						} else {
							check.get(checkCount).add(Integer.toString(room));
							checkCount++;
						}
					}
					
					
				}
			case 7:

			}
			System.out.println(matrix);

		} while (choice < 8 && choice >= 0);

	}

}
