package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import util.Util;
import visao.Menu;
import visao.Tela;

public class Controle {
	
	// Array
	List<Cliente> arrayClient = new ArrayList<Cliente>();
	

	public void avaliarOpcao(int escolha) {
		
		Tela tela = new Tela();
		Menu menu = new Menu();

		if (escolha == 0) {
			
			Util util = new Util();
			arrayClient = util.carregarArray();

		} else if (escolha == 1) {

			arrayClient.add(tela.desenharIncluir());

		} else if (escolha == 2) {
			
			// listar cliente
			
			
			tela.listarCliente(arrayClient);

		} else if (escolha == 3) {
			//Calcula a media das idades
			
			tela.exibirMedia(arrayClient);
			
		} else if (escolha == 4) {
			//Altera o cliente selecionado
			
			tela.alterarCliente(arrayClient);
			

		} else if (escolha == 5) {
			//Excluir o cliente selecionado
			
			tela.excluirCLiente(arrayClient);
			

		} else if (escolha == 6) {
			//Avalia o cliente selecionado
			
			tela.avaliarCliente(arrayClient);
			

		} else if (escolha == 7) {
			//Exibe os clientes com mais estrelas
			
			tela.exibirClientesPremiu(arrayClient);
			

		}

		else if (escolha == 8) {
			//Termina o processo
			menu.terminarProcesso();
			
		} else {
			//Exibe uma mensagem de erro caso não digite uma opção válida
			menu.exibirErro();
			
		}
	}
}
