package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.Cliente;

public class Util {

	// Gerador de clientes

	public List<Cliente> carregarArray() {

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

		for (int i = 0; i < 5; i++) {

			cliente = new Cliente();

			cliente.setNome(nomes.get(random.nextInt(nomes.size())));
			cliente.setIdade(random.nextInt(98) + 1);
			cliente.setTelefone("xx-xxxx-xxx" + i);
			cliente.setEstrelas("0");

			lista.add(cliente);
		}

		return lista;

	}
	
	//Calcular média
	public double calcularMedia(List<Cliente> lista) {

		int totalIdades = 0;

		for (Cliente c : lista) {

			totalIdades = totalIdades + c.getIdade();
		}

		return (totalIdades / lista.size());
	}
}
