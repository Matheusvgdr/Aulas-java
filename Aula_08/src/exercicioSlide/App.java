package exercicioSlide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Instances
		Scanner teclado = new Scanner(System.in);
		Cliente cliente = null;
		App app = new App();

		// Array
		List<Cliente> arrayClient = new ArrayList<Cliente>();

		// Variables
		String nome = "", telefone, confirmacao, estrelas;
		int idade, escolha, idListaCliente;
		boolean teste = true;

		// Loop
		do {
			System.out.println("----------- MENU -------------");
			System.out.println("0 - Criar clientes para teste");
			System.out.println("1 - Adicionar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Média de idades dos clientes");
			System.out.println("4 - Alterar cliente");
			System.out.println("5 - Excluir cliente");
			System.out.println("6 - Avaliar cliente");
			System.out.println("7 - Visualizar clientes Master");
			System.out.println("8 - Fim");
			System.out.println("------------------------");
			System.out.println("Digite uma opção");
			escolha = teclado.nextInt();

			
			if(escolha == 0) {
				
				arrayClient = app.carregarArray();
				
			}
			else if (escolha == 1) {

				cliente = new Cliente();
				System.out.println("Digite o nome do cliente");
				nome = teclado.next();

				System.out.println("Digite a idade do cliente");
				idade = teclado.nextInt();

				System.out.println("Digite o telefone do cliente");
				telefone = teclado.next();
				
				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setTelefone(telefone);
				
				arrayClient.add(cliente);

				

			} else if (escolha == 2) {

				for (Cliente a : arrayClient) {
					
					System.out.print("ID: " + arrayClient.indexOf(a));
					System.out.println(" -" + " Nome do cliente: " + a.getNome() + " / Idade: " + a.getIdade()
							+ " / Telefone: " + a.getTelefone());

				}

			} else if (escolha == 3) {

				
				
				System.out.println("A média de idades dos clientes é: " + app.calcularMedia(arrayClient));
				
				
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

					for (Cliente star : arrayClient) {
						
						if(star.getEstrelas().equals("5")) {
							
							System.out.println(star.getNome());
							
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
	
	public double calcularMedia(List<Cliente> lista) {
		
		int  totalIdades = 0;
		
		for(Cliente c: lista) {
			
			totalIdades = totalIdades + c.getIdade();
		}
		
		return (totalIdades / lista.size());
	}
	
	// Client Generator 
	
	public List<Cliente> carregarArray(){
		
		List<Cliente> lista = new ArrayList<Cliente>();
		List<String> nomes = new ArrayList<String>();
		Cliente cliente;
		
		Random random = new Random();
		
		nomes.add("Matheus");
		nomes.add("Sarah");
		nomes.add("Raquel");
		nomes.add("João");
		nomes.add("Marcos");
		nomes.add("Antonina");
		nomes.add("Bruna");
		nomes.add("Alex");
		
		
		for(int i = 0; i < 5; i++) {
			
			cliente = new Cliente();
			
			cliente.setNome(nomes.get(random.nextInt(nomes.size())));
			cliente.setIdade(random.nextInt(98) + 1);
			cliente.setTelefone("xx-xxxx-xxx" + i);
			
			lista.add(cliente);
		}
		
		
		return lista;

		
	}

}
