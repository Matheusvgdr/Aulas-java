package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Captcha {

<<<<<<< HEAD
	// Só exibe as "telas"
	public static void main(String[] args) {
		// Variables
		String entrada;
		String captcha = "k5PH#2";
		boolean continua = true;

		// Instances
		Captcha app = new Captcha();
		Scanner teclado = new Scanner(System.in);

		while (continua) {
			
			captcha = app.gerarCaptcha();
			System.out.println("------");
			System.out.println(captcha);
			System.out.println("------");
			System.out.println("Digite o código acima: ");
			entrada = teclado.next();

			if (captcha.equals(entrada)) {

				System.out.println("Acesso permitido");
				continua = false;

			} else {
				System.out.println("Acesso negado");

			}

		}
		teclado.close();

	}

	public String gerarCaptcha() {
		
		//Variables
		String captcha = "";
		int valor;
		
		//Instances
		Random sorteio = new Random();
		
		//Matriz
		List<String> urna = new ArrayList<String>();
		
		urna.add("A");
		urna.add("B");
		urna.add("C");
		urna.add("D");
		urna.add("E");
		urna.add("F");
		urna.add("G");
		urna.add("H");
		urna.add("I");
		urna.add("J");
		urna.add("H");
		urna.add("K");
		urna.add("L");
		urna.add("M");
		urna.add("N");
		urna.add("O");
		urna.add("P");
		urna.add("Q");
		urna.add("R");
		urna.add("S");
		urna.add("T");
		urna.add("U");
		urna.add("V");
		urna.add("W");
		urna.add("X");
		urna.add("Y");
		urna.add("Z");
		
		urna.add("0");
		urna.add("1");
		urna.add("2");
		urna.add("3");
		urna.add("4");
		urna.add("5");
		urna.add("6");
		urna.add("7");
		urna.add("8");
		urna.add("9");

		for(int i = 0; i < 6; i++) {
			
			//urna.size() = vai pegar o numero de elementos que tem no array; sorteio.nextInt() = vai selecionar um indice desse array; 
			//captcha += vai pegar concatenar os valores do array; urna.get() = vai exibir o valor que está no indice do array;
			// valor = vai receber um indice aleatorio e vai ser exibido no get();
			valor = sorteio.nextInt(urna.size());
			
			captcha += urna.get(valor);	
		}
		
		return captcha;
		

	}
=======
	public static void main(String[] args) {
		
		String resposta; 
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < 1; i++ ) {
			System.out.println("Captcha " + createCaptchaValue());
		}
		
		System.out.println("Digite o captcha");
		resposta = teclado.next();
		
		if(resposta.equals(createCaptchaValue())) {
			System.out.println("Acesso permitido");
		} 

	}
	
	public static String createCaptchaValue() {
		
		Random random = new Random();
		int length = 5 + (Math.abs(random.nextInt()) % 3);
		StringBuffer captchaStrBuffer = new StringBuffer();
		
		for (int i = 0; i < length; i++) {
			
			int baseCharacterNumber = Math.abs(random.nextInt() % 62);
			int characterNumber = 0;
			
			if(baseCharacterNumber < 26){
				
				characterNumber = 97 + (baseCharacterNumber - 26);
			} else {
				characterNumber = 48 + (baseCharacterNumber - 52);
			}
			captchaStrBuffer.append((char) characterNumber);
		}
		
		return captchaStrBuffer.toString();
	}
	
	
>>>>>>> fc17ee7fcc9c23942a410db7a2e81aa8268eee4d

}
