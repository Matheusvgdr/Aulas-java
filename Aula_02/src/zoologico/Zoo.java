package zoologico;

public class Zoo {

	public static void main(String[] args) {
		
		Pelicano p1, p2;
		
		p1 = new Pelicano();
		p2 = new Pelicano();
		
		p1.setCor("branco");
		p1.setPeso(40);
		p1.voar();
		p1.definirNome("Matheus");
		
		p2.setCor("preto");
		p2.setPeso(20);
		p2.comer();
		
		System.out.println("O pelicano p1 é " + p1.getCor());
		System.out.println("O pelicano p2 pesa" + p2.getPeso());
		System.out.println("Outra forma de retornar a cor é " + p2.retornaCor());
		
		
		
		
	}

}
