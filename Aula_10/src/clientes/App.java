package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controle.Controle;
import modelo.Cliente;
import visao.Menu;

public class App {

	public static void main(String[] args) {

		// Instâncias
		Scanner teclado = new Scanner(System.in);
		Menu menu = new Menu();
		Controle controle = new Controle();

		// Variáveis
		int escolha;
		

		// Loop
		do {
			
			menu.desenharMenu();
			escolha = teclado.nextInt();
			
			controle.avaliarOpcao(escolha);
			
		} while (escolha < 8); // Condition

	}
	
}
