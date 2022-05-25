package matrizes;

public class LivrosTeste {

	public static void main(String[] args) {
		
		// Não funciona porque não há objetos criados para por no array que só aceita objetos livros e não do tipo string;
		Livros[] meusLivros = new Livros[3];
		int x = 0;
		meusLivros[0].titulo = "Java forever";
		meusLivros[1].titulo = "Java em orbita";
		meusLivros[2].titulo = "Cozinhe com Java";
		meusLivros[0].autor = "bob";
		meusLivros[1].autor = "sue";
		meusLivros[2].autor = "ian";
		
		while (x < 3){
		System.out.print(meusLivros[x].titulo);
		System.out.print(" de ");
		System.out.println(meusLivros[x].autor);
		x = x +1;
		}
	}

}
