package carteira;

import java.util.Scanner;

import controle.Controle;
import visao.Menu;

public class App {
	
	public static void main(String[] args) {
		
		//Instancias
		Controle controle = new Controle();
		Scanner teclado = new Scanner(System.in);
		Menu menu = new Menu();
		
		//Variaveis
		int escolha;
		
		//Loop
		do {

			menu.desenharMenu();
			escolha = teclado.nextInt();
		
			controle.avaliarEscolha(escolha);
			
		}while(escolha < 6);

	}

}
