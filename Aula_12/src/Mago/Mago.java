package Mago;

import Personagem.Personagem;
import tipoMago.Fogo;
import tipoMago.Gelo;

public class Mago extends Personagem implements Gelo, Fogo {

	@Override
	public void congelar() {
		
		System.out.println("O inimigo foi congelado");
		
	}

	@Override
	public void queimar() {
		System.out.println("Burn bitch BURN");
		
	}

	
}
