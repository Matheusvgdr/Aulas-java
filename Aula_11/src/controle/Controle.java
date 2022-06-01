package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Carteira;
import visao.Menu;
import visao.Tela;


public class Controle {
	
	List<Carteira> bancoCarteiras = new ArrayList<Carteira>();
	
	public void avaliarEscolha(int escolha) {
		
		Tela tela = new Tela();
		Menu menu = new Menu();
		Carteira carteira = new Carteira();
		
		if(escolha == 1) {
		//Cadastra uma nova carteira
			
			bancoCarteiras.add(tela.cadastrarCarteira());
		
			
		} else if(escolha == 2) {
		//Exibe o saldo de uma carteira
			
			carteira.exibirSaldo(bancoCarteiras);
			
		} else if(escolha == 3) {
		//Adiciona valor à carteira
			
			carteira.colocarValor(bancoCarteiras);
			
		} else if (escolha == 4) {
		//Retira valor da carteira
			
			carteira.retirarValor(bancoCarteiras);
			
		} else if(escolha == 5) {
			
		//Exibe as carteiras criadas
			tela.exibirCarteiras(bancoCarteiras);
			
		} else if(escolha == 6) {
			
			menu.terminarPrograma();
		}
	}

}
