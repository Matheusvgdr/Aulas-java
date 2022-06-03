package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Carteira;

public class Tela {

	Scanner teclado = new Scanner(System.in);
	String nome;

	public Carteira cadastrarCarteira() {

		Carteira carteira = new Carteira();

		System.out.println("Digite o nome da carteira que deseja criar");
		nome = teclado.next();

		carteira.setNome(nome);

		return carteira;
	}

	public void exibirCarteiras(List<Carteira> bancoCarteiras) {

		for (Carteira c : bancoCarteiras) {

			System.out.print("ID - " + bancoCarteiras.indexOf(c) + " ");

			System.out.println(c);

		}

	}

}
