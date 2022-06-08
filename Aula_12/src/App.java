import Mago.Mago;
import Personagem.Personagem;

public class App {

	public static void main(String[] args) {
		
		Mago mago = new Mago();
		
		mago.setAltura("1.85");
		mago.setNome("Rúbia");
		
		mago.congelar();
	}

}
