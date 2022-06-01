package modelo;

import java.util.List;
import java.util.Scanner;

public class Carteira {
	int escolha, dinheiro;
	double somaSaldo, retiradaSaldo;

	Scanner teclado = new Scanner(System.in);

	private String nome;
	private double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void exibirSaldo(List<Carteira> bancoCarteiras) {

		System.out.println("Selecione o ID da carteira que deseja visualizar o saldo: ");
		escolha = teclado.nextInt();

		System.out.println(bancoCarteiras.get(escolha));

	}

	public void colocarValor(List<Carteira> bancoCarteiras) {

		System.out.println("Selecione o ID de uma carteira: ");
		escolha = teclado.nextInt();

		System.out.println("A carteira selecionada foi: " + bancoCarteiras.get(escolha));

		System.out.println("Qual a quantia que deseja inserir na sua carteira?");
		dinheiro = teclado.nextInt();

		somaSaldo = dinheiro + bancoCarteiras.get(escolha).getSaldo();

		bancoCarteiras.get(escolha).setSaldo(somaSaldo);

	}

	public void retirarValor(List<Carteira> bancoCarteiras) {

		System.out.println("Selecioneo ID de uma carteira: ");
		escolha = teclado.nextInt();

		System.out.println("A carteira selecionada foi: " + bancoCarteiras.get(escolha));

		System.out.println("Qual a quantia que deseja retirar?");
		dinheiro = teclado.nextInt();

		if (dinheiro > bancoCarteiras.get(escolha).getSaldo()) {

			System.out.println("Você não possui esse valor em conta, saque negado");

		} else {

			retiradaSaldo = bancoCarteiras.get(escolha).getSaldo() - dinheiro;

			bancoCarteiras.get(escolha).setSaldo(retiradaSaldo);

			System.out.println("Saldo realizado com sucesso");
		}

	}

	@Override
	public String toString() {
		return "Nome da carteira: " + nome + " / Saldo atual: " + saldo;
	}

}
