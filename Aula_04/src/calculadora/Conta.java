package calculadora;

public class Conta {

	public static void main(String[] args) {
		
		
		Calculadora cal = new Calculadora();
		
		// Constructor com parametro = Calculadora cal = new Calculadora(1,2);
		double calculo = 0;
		
		//metodo com os parametros já passados pelo constructor;
		cal.somar();

		/*
		 * cal.setValor1(12); cal.setValor2(6);
		 * 
		 * System.out.println(cal.somar(4,5)); System.out.println(cal.subtrair());
		 * System.out.println(cal.multiplicar()); System.out.println(cal.dividir());
		 */

		System.out.println(cal.somar(5, 10));
		System.out.println(cal.subtrair(4, 8));
		
		
		calculo = cal.dividir(6, 0);
		
		if (calculo == 0) {

			System.out.println("Não é permitido usar 0 na divisão");

		} else {

			System.out.println(cal.dividir(6, 0));

		}
	}

}
