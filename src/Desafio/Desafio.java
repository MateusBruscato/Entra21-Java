/**
 * 
 */
package Desafio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mateu
 *
 */
public class Desafio {

	static Scanner entrada = new Scanner(System.in);

	static ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();

	static ArrayList<ArrayList<String>> quartos = new ArrayList<ArrayList<String>>();

	static ArrayList<ArrayList<String>> check = new ArrayList<ArrayList<String>>();

	static ArrayList<String> freeRooms = new ArrayList<String>();

	static String menu = "Sistema de Gestão de Hotel \n\n" + "1 - Cadastrar Clientes \n"
			+ "2 - Editar, exlcuir ou consultar clientes \n" + "3 - Cadastrar Quartos \n"
			+ "4 - Editar Cadastro de Quarto \n" + "5 - Checar Quartos Disponíveis \n" + "6 - Realizar Check-In \n"
			+ "7 - Realizar Check-Out \n" + "0 - Sair \n";

	public static final String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

	public static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	public static boolean isValid(final String email) {
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice;
		int costmNumb = 1;
		int roomNumb = 0;
		int checkCount = 0;

		entrada.useDelimiter(System.lineSeparator());

		matrix.add(new ArrayList<String>());
		matrix.get(0).add("Código do cliente: ");
		matrix.get(0).add("Nome: ");
		matrix.get(0).add("Data de nascimento: ");
		matrix.get(0).add("E-mail: ");
		matrix.get(0).add("Telefone: ");
		matrix.get(0).add("Cidade: ");
		matrix.get(0).add("UF: ");
		matrix.get(0).add("Fumante: ");

		
		do {
			try {
			System.out.println(menu);
			choice = Integer.valueOf(entrada.next());

			switch (choice) {
			// Cadastrar clientes

			case 1:

				System.out.println("CADASTRO DE CLIENTE: \n" + "Código do cliente: " + costmNumb);
				matrix.add(new ArrayList<String>());
				//Entrada 0
				matrix.get(costmNumb).add(Integer.toString(costmNumb));
				System.out.println("Nome: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("Data de nascimento: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("E-mail: ");
				matrix.get(costmNumb).add(entrada.next());
				boolean b = isValid(matrix.get(costmNumb).get(3));
				while (b == false) {
					System.out.println("Insira um e-mail válido!");
					matrix.get(costmNumb).set(3, entrada.next());
					b = isValid(matrix.get(costmNumb).get(3));
				}

				System.out.println("Telefone: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("Cidade: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("UF: ");
				matrix.get(costmNumb).add(entrada.next());

				System.out.println("Fumante? ");
				matrix.get(costmNumb).add(entrada.next());

				while (!matrix.get(costmNumb).get(7).equals("S") && !matrix.get(costmNumb).get(7).equals("N")) {
					System.out.println("Responda somente com S ou N.");
					matrix.get(costmNumb).set(7, entrada.next());
				}

				System.out.println("Cadastro do cliente " + matrix.get(costmNumb).get(0) + ": \n");
				for (int i = 0; i < matrix.get(costmNumb).size(); i++) {
					System.out.println(matrix.get(0).get(i) + matrix.get(costmNumb).get(i));
				}
				costmNumb++;
				break;

			case 2:

				System.out.println("Você deseja: \n \n" + "1 - Editar/excluir cliente.\n"
						+ "2 - Consultar lista de clientes cadastrados. \n");
				int opt = Integer.valueOf(entrada.next());

				switch (opt) {
				case 1:
					try {

						System.out.println("Qual cliente você gostaria de editar/excluir?\n \n" + "Código: ");

						String costmCode = entrada.next();

						if(Integer.valueOf(costmCode) < 1 || Integer.valueOf(costmCode) > Integer.valueOf(costmNumb)) {
							System.out.println("Código de cliente não existe!");
							break;
						}
						

						int costmIndex = 0;

						for (int i = 0; i < matrix.size(); i++) {
							if (matrix.get(i).get(0).contains(costmCode)) {
								costmIndex = i;
							}
						}

						System.out.println("Você gostaria de editar/excluir o cliente: " + matrix.get(costmIndex).get(1)
								+ "? \n \n" + "1 - Sim \n" + "2 - Não");
						int ans = Integer.valueOf(entrada.next());

						do {
							switch (ans) {
							case 1:
								System.out.println("Você gostaria de: \n \n" + "1 - Excluir o cadastro do cliente \n"
										+ "2 - Editar o cadastro do cliente \n" + "3 - Retornar para o menu de edição");
								int edit = Integer.valueOf(entrada.next());

								if (edit == 1) {
									System.out.println("Tem certeza que gostaria de exlcuir o cadastro do cliente "
											+ matrix.get(costmIndex).get(0) + "? \n \n" + " 1 - Sim \n" + "2 - Não");
									int sure = Integer.valueOf(entrada.next());

									if (sure == 1) {
										matrix.remove(costmIndex);
										System.out.println("Removido com sucesso! \n");
										costmNumb--;
										break;
									}
								} else if (edit == 2) {

									System.out.println("Qual informação você gostaria de editar? \n \n" + "1 - Nome \n"
											+ "2 - Data de nascimento \n" + "3 - E-mail \n" + "4 - Telefone \n"
											+ "5 - Cidade \n" + "6 - UF \n" + "7 - Fumante");

									int ans2 = Integer.valueOf(entrada.next());

									if(ans2 > 7 || ans2 < 1) {
										System.out.println("Opção Inválida! \n" + "Escolha entre as opções de 1 a 7.");
										ans2 = Integer.valueOf(entrada.next());
									} 

									System.out.println("Digite a nova informação: ");
									matrix.get(costmIndex).set(ans2, entrada.next());
									break;
								} else {
									break;
								}

							case 2:
								break;
								default:
									System.out.println("Opção Inválida! \n");
									break;
							}

						} while (ans != 1 && ans != 2);
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Este cliente/informação não existe! \n");
						break;
					}
					break;
				case 2:
					for (int i = 1; i < matrix.size(); i++) {
						System.out.println("Código Cliente: " + matrix.get(i).get(0) + ". Nome Cliente: "
								+ matrix.get(i).get(1) + "\n");
					}
					break;
				}
				break;

			case 3:

				System.out.println("Número do quarto: ");
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

				quartos.get(roomNumb).add("f");
				//Printar Cadastro
				roomNumb++;
				break;
			case 4:

				try {

					System.out.println("Qual quarto você gostaria de editar/excluir?");
					int roomCode = Integer.valueOf(entrada.next());
					int roomIndex = 0;
					
					for (int i = 0; i < quartos.size(); i++) {
						if(quartos.get(i).get(0).equals(Integer.toString(roomCode))) {
							roomIndex = i;
						}
					}
					System.out.println("Você gostaria de editar/excluir o quarto: " + quartos.get(roomIndex).get(0)
							+ "? \n" + "1 - Sim \n" + "2 - Não");
					int ans = Integer.valueOf(entrada.next());

					do {
						switch (ans) {
						case 1:
							System.out.println("Você gostaria de: \n" + "1 - Excluir o quarto \n"
									+ "2 - Editar as informações do quarto \n" + "3 - Retornar para o menu de edição");
							int edit = Integer.valueOf(entrada.next());

							if (edit == 1) {
								System.out.println("Tem certeza que gostaria de exlcuir o quarto "
										+ quartos.get(roomIndex).get(0) + "?\n" + " 1 - Sim \n" + "2 - Não");
								int sure = Integer.valueOf(entrada.next());

								if (sure == 1) {
									quartos.remove(roomIndex);
									System.out.println("Removido com sucesso!");
									break;
								}
							} else if (edit == 2) {
								System.out.println("Qual informação você gostaria de editar? \n" + "1 - Número \n"
										+ "2 - Posição \n" + "3 - Aceita fumante \n" + "4 - Valor da diária \n"
										+ "5 - Número de quartos \n" + "6 - Disponibilidade de pessoas por quarto");
								int ans2 = Integer.valueOf(entrada.next());
								quartos.get(roomIndex).set((ans2 - 1), entrada.next());
								//Printar Cadastro atualizado
							} else {
								break;
							}

						case 2:
							break;
							
						default:
							System.out.println("Opção Inválida! \n");
						}
					} while (ans != 1 && ans != 2);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Este quarto não existe! \n");
					break;
				}
				break;

			case 5:

				for (int i = 0; i < quartos.size(); i++) {
					if (quartos.get(i).get(6).equals("f")) {
						System.out.println(quartos.get(i).get(0));
					} else {
						continue;
					}
				}
				break;

			case 6:

				System.out.println("Qual o código do cliente que gostaria de fazer Check-In?");
				int costumer = Integer.valueOf(entrada.next());

				System.out.println("Cliente: " + matrix.get(costumer).get(1) + ". Deseja continuar? \n" + "1 - Sim \n"
						+ "2 - Não");
				int ans = Integer.valueOf(entrada.next());

				if (ans == 1) {
					check.add(new ArrayList<String>());
					// Adicionar primeira linha na matriz
					check.get(checkCount).add(Integer.toString(costumer));
					check.get(checkCount).add(Integer.toString(-1));

					System.out.println(
							"Qual quarto o cliente " + matrix.get(costumer).get(0) + " deseja fazer check in?");
					int room = Integer.valueOf(entrada.next());

					// Checar quais quartos estão ocupados. Caso disponível, realiza check-In
					for (int i = 0; i < quartos.size(); i++) {
						if (quartos.get(i).get(6).equals("t") && quartos.get(i).get(0).equals(Integer.toString(room))) {
							System.out.println("Este quarto já está ocupado!");
						} else if (quartos.get(i).get(0).equals(Integer.toString(room))) {
							check.get(checkCount).set(1, Integer.toString(room));
							quartos.get(i).set(6, "t");
							checkCount++;
							System.out.println("Check-In realizado com sucesso! \n");
						}
					}
				} else {
					break;
				}

				break;
			case 7:

				System.out.println("Qual o código do cliente que gostaria de fazer Check-Out?");
				costumer = Integer.valueOf(entrada.next());

				System.out.println("Cliente: " + matrix.get(costumer).get(0) + ". Deseja continuar? \n" + " 1 - Sim \n"
						+ "2 - Não");
				ans = Integer.valueOf(entrada.next());

				if (ans == 1) {
					for (int i = 0; i < check.size(); i++) {
						if (check.get(i).get(0).equals(Integer.toString(costumer))) {
							for (int j = 0; j < quartos.size(); j++) {
								if (quartos.get(j).get(0).equals((check.get(i).get(1)))) {
									quartos.get(j).set(6, "f");
									checkCount--;
									check.remove(i);
									System.out.println("Check-Out realizado com sucesso! \n");
								}
							}
						}
					}
				}
				break;

			case 0:
				System.out.println("Tem certeza que deseja sair?\n" + "1 - Sim \n" + "2 - Não \n");
				System.out.println("Resposta: ");
				int sure = Integer.valueOf(entrada.next());

				if (sure == 1) {
					System.out.println("Programa finalizado!");
					return;
				} else if (sure == 2) {
					break;
				} else {
					System.out.println("Opção inválida!");
					break;
				}

			default:
				System.out.println("Opção Inválida! \n");
				break;
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Esta opção não existe.\n");
		}
		} while (true);

	}

}
