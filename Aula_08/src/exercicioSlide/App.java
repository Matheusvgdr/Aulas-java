package exercicioSlide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Instances
		Scanner teclado = new Scanner(System.in);
		Clientes cliente = null;

		// Array
		List<Clientes> arrayClient = new ArrayList<Clientes>();

		// Variables
		String nome = "", telefone, confirmacao, estrelas;
		int idade, escolha, totalArray, totalIdades = 0, idListaCliente;
		double media = 0.0;
		boolean teste = true;

		// Loop
		do {
			System.out.println("O que deseja realizar?");
			System.out.println("------------------------");
			System.out.println("1 - Adicionar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Média de idades dos clientes");
			System.out.println("4 - Alterar cliente");
			System.out.println("5 - Excluir cliente");
			System.out.println("6 - Avaliar cliente");
			System.out.println("7 - Visualizar clientes com mais estrelas");
			System.out.println("8 - Fim");
			System.out.println("------------------------");
			escolha = teclado.nextInt();

			if (escolha == 1) {

				cliente = new Clientes();
				System.out.println("Digite o nome do cliente");
				nome = teclado.next();

				System.out.println("Digite a idade do cliente");
				idade = teclado.nextInt();

				System.out.println("Digite o telefone do cliente");
				telefone = teclado.next();

				arrayClient.add(cliente);

				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setTelefone(telefone);

			} else if (escolha == 2) {

				for (Clientes a : arrayClient) {
					System.out.print("ID: " + arrayClient.indexOf(a));
					System.out.println(" -" + " Nome do cliente: " + a.getNome() + " / Idade: " + a.getIdade()
							+ " / Telefone: " + a.getTelefone());

				}

			} else if (escolha == 3) {

				totalArray = arrayClient.size();

				for (Clientes a : arrayClient) {

					totalIdades = totalIdades + a.getIdade();
					media = totalIdades / totalArray;
				}

				System.out.println("A média de idades dos clientes é: " + media);

			} else if (escolha == 4) {

				System.out.println("Qual o ID do cliente gostaria de alterar?");
				idListaCliente = teclado.nextInt();

				System.out.println(arrayClient.get(idListaCliente));

				System.out.println("Digite o nome do cliente");
				nome = teclado.next();

				System.out.println("Digite a idade do cliente");
				idade = teclado.nextInt();

				System.out.println("Digite o telefone do cliente");
				telefone = teclado.next();

				arrayClient.get(idListaCliente).setNome(nome);
				arrayClient.get(idListaCliente).setIdade(idade);
				arrayClient.get(idListaCliente).setTelefone(telefone);

				System.out.println("Alteração feita com sucesso");

			} else if (escolha == 5) {

				System.out.println("Qual o ID do cliente gostaria de excluir?");
				idListaCliente = teclado.nextInt();

				System.out.println(arrayClient.get(idListaCliente));

				System.out.println("Confirma a exclusão desse cliente? S/N");
				confirmacao = teclado.next();

				if (confirmacao.equals("S")) {

					arrayClient.remove(idListaCliente);
					System.out.println("Exclusão realizada com sucesso");

				} else {

					System.out.println("Exclusão cancelada.");

				}

			} else if (escolha == 6) {

				System.out.println("Qual o ID do cliente gostaria de avaliar");
				idListaCliente = teclado.nextInt();

				System.out.println(arrayClient.get(idListaCliente));

				System.out.println("Com quantas estrelas deseja avaliar? de 1 à 5");
				estrelas = teclado.next();

				arrayClient.get(idListaCliente).setEstrelas(estrelas);

			} else if (escolha == 7) {

				System.out.println("Deseja ver os clientes com estrelas acima de 4? S/N");
				confirmacao = teclado.next();

				if (confirmacao.equals("S")) {

					for (Clientes star : arrayClient) {

						System.out.println(star.getEstrelas().equals("5"));

						star.getNome();
					}

				}

			}

			else if (escolha == 8) {

				System.out.println("Processo finalizado");
				teste = false;

			} else {
				System.out.println("Erro na seleção da opção, digite novamente");
			}

		} while (teste == true); // Condition

	}

}
