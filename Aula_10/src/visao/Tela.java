package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import util.Util;

public class Tela {

	Scanner teclado = new Scanner(System.in);
	
	String nome, telefone;
	int idade, idListaCliente;

	public Cliente desenharIncluir() {

		Cliente cliente = new Cliente();

		System.out.println("Digite o nome do cliente");
		nome = teclado.next();

		System.out.println("Digite a idade do cliente");
		idade = teclado.nextInt();

		System.out.println("Digite o telefone do cliente");
		telefone = teclado.next();

		cliente.setNome(nome);
		cliente.setIdade(idade);
		cliente.setTelefone(telefone);

		return cliente;
	}

	public void listarCliente(List<Cliente> arrayClient) {

		for (Cliente a : arrayClient) {

			System.out.print("ID: " + arrayClient.indexOf(a));
			System.out.println(" -" + " Nome do cliente: " + a.getNome() + " / Idade: " + a.getIdade() + " / Telefone: "
					+ a.getTelefone());

		}

	}

	public void exibirMedia(List<Cliente> arrayClient) {

		Util util = new Util();

		System.out.println("A média de idades dos clientes é: " + util.calcularMedia(arrayClient));

	}

	public void alterarCliente(List<Cliente> arrayClient) {

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
	}

	public void excluirCLiente(List<Cliente> arrayClient) {

		String confirmacao;
		
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
	}

	public void avaliarCliente(List<Cliente> arrayClient) {
		
		String estrelas;
		
		System.out.println("Qual o ID do cliente gostaria de avaliar");
		idListaCliente = teclado.nextInt();

		System.out.println(arrayClient.get(idListaCliente));

		System.out.println("Com quantas estrelas deseja avaliar? de 1 à 5");
		estrelas = teclado.next();

		arrayClient.get(idListaCliente).setEstrelas(estrelas);
	}

	public void exibirClientesPremiu(List<Cliente> arrayClient) {
		
		for (Cliente star : arrayClient) {

			if (star.getEstrelas().equals("5")) {

				System.out.println(star.getNome());

			}
		}
	}
}
